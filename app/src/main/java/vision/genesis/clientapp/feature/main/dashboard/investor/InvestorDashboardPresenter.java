package vision.genesis.clientapp.feature.main.dashboard.investor;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import io.swagger.client.model.AssetsValue;
import io.swagger.client.model.DashboardPortfolioEvent;
import io.swagger.client.model.DashboardSummary;
import io.swagger.client.model.OtherAssetsValue;
import io.swagger.client.model.ProgramRequest;
import io.swagger.client.model.ValueChartBar;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.common.currency.SelectCurrencyFragment;
import vision.genesis.clientapp.feature.common.date_range.DateRangeBottomSheetFragment;
import vision.genesis.clientapp.managers.InvestorDashboardManager;
import vision.genesis.clientapp.managers.SettingsManager;
import vision.genesis.clientapp.model.CurrencyEnum;
import vision.genesis.clientapp.model.DateRange;
import vision.genesis.clientapp.model.PortfolioAssetData;
import vision.genesis.clientapp.model.PortfolioEvent;
import vision.genesis.clientapp.model.events.OnInRequestsClickedEvent;
import vision.genesis.clientapp.model.events.OnPortfolioAssetsChangedEvent;
import vision.genesis.clientapp.model.events.OnPortfolioChartViewModeChangedEvent;
import vision.genesis.clientapp.model.events.OnRequestCancelledEvent;
import vision.genesis.clientapp.model.events.ShowProgramRequestsEvent;
import vision.genesis.clientapp.utils.StringFormatUtil;

/**
 * GenesisVision
 * Created by Vitaly on 1/19/18.
 */

@InjectViewState
public class InvestorDashboardPresenter extends MvpPresenter<InvestorDashboardView> implements DateRangeBottomSheetFragment.OnDateRangeChangedListener, SelectCurrencyFragment.OnCurrencyChangedListener
{
	@Inject
	public Context context;

	@Inject
	public InvestorDashboardManager dashboardManager;

	@Inject
	public SettingsManager settingsManager;

	private Subscription baseCurrencySubscription;

	private Subscription dateRangeSubscription;

	private Subscription dashboardSubscription;

	private DateRange dateRange;

	private CurrencyEnum baseCurrency;

	private List<List<PortfolioAssetData>> portfolioAssetsDataList = new ArrayList<>();

	private List<ProgramRequest> requests = new ArrayList<>();

	private List<PortfolioEvent> newPreparedEvents;

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);

		EventBus.getDefault().register(this);

		subscribeToDateRange();
		subscribeToBaseCurrency();
	}

	@Override
	public void onDestroy() {
		if (baseCurrencySubscription != null)
			baseCurrencySubscription.unsubscribe();
		if (dateRangeSubscription != null)
			dateRangeSubscription.unsubscribe();
		if (dashboardSubscription != null)
			dashboardSubscription.unsubscribe();

		EventBus.getDefault().unregister(this);

		super.onDestroy();
	}

	void onResume() {
		getDashboard();
	}

	void onSwipeRefresh() {
		getViewState().setRefreshing(true);
		getDashboard();
	}

	private void subscribeToBaseCurrency() {
		baseCurrencySubscription = settingsManager.getBaseCurrency()
				.subscribeOn(Schedulers.newThread())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(this::baseCurrencyChangedHandler);
	}

	private void baseCurrencyChangedHandler(CurrencyEnum baseCurrency) {
		this.baseCurrency = baseCurrency;
		getViewState().setBaseCurrency(baseCurrency);
		getViewState().showProgressBar(true);
		getDashboard();
	}

	private void subscribeToDateRange() {
		dateRangeSubscription = settingsManager.getDateRange()
				.subscribeOn(Schedulers.newThread())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(this::dateRangeChangedHandler);
	}

	private void dateRangeChangedHandler(DateRange dateRange) {
		this.dateRange = dateRange;
		getViewState().setDateRange(dateRange);
		getViewState().showProgressBar(true);
		getDashboard();
	}

	private void getDashboard() {
		if (dashboardSubscription != null)
			dashboardSubscription.unsubscribe();
		if (baseCurrency != null && dateRange != null) {
			updateDateRange();
			dashboardSubscription = dashboardManager.getDashboard(dateRange, baseCurrency.getValue())
					.subscribeOn(Schedulers.newThread())
					.map(this::prepareData)
					.observeOn(AndroidSchedulers.mainThread())
					.subscribe(this::handleGetDashboardSuccess,
							this::handleGetDashboardError);
		}
	}

	private DashboardSummary prepareData(DashboardSummary dashboardSummary) {
		portfolioAssetsDataList.clear();
		int colorRed = ContextCompat.getColor(context, R.color.red);
		int colorGreen = ContextCompat.getColor(context, R.color.green);
		int[] colors = context.getResources().getIntArray(R.array.assetsColors);
		int colorIndex;
		for (ValueChartBar valueChartBar : dashboardSummary.getChart().getInvestedProgramsInfo()) {
			List<PortfolioAssetData> portfolioAssetDataList = new ArrayList<>();
			colorIndex = 0;
			//TODO: add other assets
			for (AssetsValue assetsValue : valueChartBar.getTopAssets()) {
				PortfolioAssetData portfolioAssetData = new PortfolioAssetData(
						colors[colorIndex],
						assetsValue.getTitle(),
						String.format(Locale.getDefault(), "%s GVT",
								StringFormatUtil.formatAmount(assetsValue.getValue(),
										0, StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()))),
						assetsValue.getChangePercent() == null
								? "-"
								: String.format(Locale.getDefault(), "%s%%", StringFormatUtil.formatAmount(Math.abs(assetsValue.getChangePercent()), 0, 2)),
						assetsValue.getChangePercent() != null
								? assetsValue.getChangePercent() < 0 ? colorRed : colorGreen
								: colorGreen,
						String.format(Locale.getDefault(), "%s%s GVT", assetsValue.getChangeValue() > 0 ? "+" : "",
								StringFormatUtil.formatAmount(assetsValue.getChangeValue(),
										0, StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()))));
				portfolioAssetDataList.add(portfolioAssetData);

				if (++colorIndex == colors.length)
					colorIndex = 0;
			}
			OtherAssetsValue other = valueChartBar.getOtherAssetsValue();
			if (other != null) {
				PortfolioAssetData portfolioAssetData = new PortfolioAssetData(
						colors[colorIndex],
						context.getString(R.string.other),
						String.format(Locale.getDefault(), "%s GVT",
								StringFormatUtil.formatAmount(other.getValue(),
										0, StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()))),
						other.getChangePercent() == null
								? "-"
								: String.format(Locale.getDefault(), "%s%%", StringFormatUtil.formatAmount(Math.abs(other.getChangePercent()), 0, 2)),
						other.getChangePercent() != null
								? other.getChangePercent() < 0 ? colorRed : colorGreen
								: colorGreen,
						String.format(Locale.getDefault(), "%s%s GVT", other.getChangeValue() > 0 ? "+" : "",
								StringFormatUtil.formatAmount(other.getChangeValue(),
										0, StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()))));
				portfolioAssetDataList.add(portfolioAssetData);
			}
			portfolioAssetsDataList.add(portfolioAssetDataList);
		}

		newPreparedEvents = new ArrayList<>();
		for (DashboardPortfolioEvent event : dashboardSummary.getEvents().getEvents()) {
			newPreparedEvents.add(PortfolioEvent.createFrom(event));
		}

		return dashboardSummary;
	}

	private void updateDateRange() {
		dateRange.updateDates(dateRange.getSelectedRange());
		getViewState().setDateRange(dateRange);
	}

	private void handleGetDashboardSuccess(DashboardSummary response) {
		dashboardSubscription.unsubscribe();
		getViewState().setRefreshing(false);
		getViewState().showProgressBar(false);

		this.requests = response.getRequests().getRequests();

		getViewState().setHaveNewNotifications(response.getProfileHeader().getNotificationsCount() > 0);
		getViewState().setChartData(response.getChart());
		getViewState().setInRequests(response.getRequests().getTotalValue(), response.getChart().getRate());
		getViewState().setPortfolioEvents(newPreparedEvents);
		getViewState().setAssetsCount(response.getProgramsCount(), response.getFundsCount());

	}

	private void handleGetDashboardError(Throwable throwable) {
		dashboardSubscription.unsubscribe();
		getViewState().setRefreshing(false);
	}

	@Override
	public void onDateRangeChanged(DateRange dateRange) {
		settingsManager.saveDateRange(dateRange);
	}

	@Override
	public void onCurrencyChanged(CurrencyEnum currency) {
		settingsManager.saveBaseCurrency(currency);
	}

	@Subscribe
	public void onEventMainThread(OnPortfolioChartViewModeChangedEvent event) {
		getViewState().setChartViewMode(event.getViewMode(), event.getChartBottomY());
	}

	@Subscribe
	public void onEventMainThread(OnPortfolioAssetsChangedEvent event) {
		if (event.getIndex() < portfolioAssetsDataList.size())
			getViewState().setPortfolioAssets(portfolioAssetsDataList.get(event.getIndex()));
	}

	@Subscribe
	public void onEventMainThread(OnInRequestsClickedEvent event) {
		getViewState().showInRequests(requests);
	}

	@Subscribe
	public void onEventMainThread(OnRequestCancelledEvent event) {
		getDashboard();
	}

	@Subscribe
	public void onEventMainThread(ShowProgramRequestsEvent event) {
		getViewState().showProgramRequests(event.getProgramId());
	}
}
