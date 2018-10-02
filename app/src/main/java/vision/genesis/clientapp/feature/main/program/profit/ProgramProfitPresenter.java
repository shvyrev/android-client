package vision.genesis.clientapp.feature.main.program.profit;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import io.swagger.client.model.ChartSimple;
import io.swagger.client.model.ProgramChart;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.feature.common.date_range.DateRangeBottomSheetFragment;
import vision.genesis.clientapp.managers.ProgramsManager;
import vision.genesis.clientapp.managers.SettingsManager;
import vision.genesis.clientapp.model.CurrencyEnum;
import vision.genesis.clientapp.model.DateRange;
import vision.genesis.clientapp.utils.StringFormatUtil;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 27/09/2018.
 */

@InjectViewState
public class ProgramProfitPresenter extends MvpPresenter<ProgramProfitView> implements DateRangeBottomSheetFragment.OnDateRangeChangedListener
{
	@Inject
	public ProgramsManager programsManager;

	@Inject
	public SettingsManager settingsManager;

	private Subscription baseCurrencySubscription;

	private Subscription chartDataSubscription;

	private UUID programId;

	private CurrencyEnum baseCurrency;

	private Double first;

	private Double selected;

	private ProgramChart chartData;

	private DateRange chartDateRange = DateRange.createFromEnum(DateRange.DateRangeEnum.WEEK);

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);

		subscribeToBaseCurrency();

		getViewState().setDateRange(chartDateRange);
		getViewState().showProgress(true);
		getChartData();
	}

	@Override
	public void onDestroy() {
		if (baseCurrencySubscription != null)
			baseCurrencySubscription.unsubscribe();
		if (chartDataSubscription != null)
			chartDataSubscription.unsubscribe();

		super.onDestroy();
	}

	void setProgramId(UUID programId) {
		this.programId = programId;
		getChartData();
	}

	void onShow() {
		getChartData();
	}

//	void onChartTimeFrameChanged(String newTimeFrame) {
//		chartTimeFrame = newTimeFrame;
//		getChartData();
//	}

	private void subscribeToBaseCurrency() {
		baseCurrencySubscription = settingsManager.getBaseCurrency()
				.subscribeOn(Schedulers.newThread())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(this::baseCurrencyChangedHandler);
	}

	private void baseCurrencyChangedHandler(CurrencyEnum baseCurrency) {
		this.baseCurrency = baseCurrency;

		getChartData();
	}

	private void getChartData() {
		if (programId != null && programsManager != null && baseCurrency != null) {
			if (chartDataSubscription != null)
				chartDataSubscription.unsubscribe();
			//TODO: calculate maxPointCount
			chartDataSubscription = programsManager.getProfitChart(programId, baseCurrency, chartDateRange, 10)
					.observeOn(AndroidSchedulers.mainThread())
					.subscribeOn(Schedulers.io())
					.subscribe(this::handleGetChartDataSuccess,
							this::handleGetChartDataError);
		}
	}

	private void handleGetChartDataSuccess(ProgramChart response) {
		chartDataSubscription.unsubscribe();
		getViewState().showProgress(false);

		this.chartData = response;

		getViewState().setChartData(chartData.getChart().get(0).getEquityChart());

		resetValuesSelection();
	}

	private void handleGetChartDataError(Throwable throwable) {
		chartDataSubscription.unsubscribe();
		getViewState().showProgress(false);
	}

	private void resetValuesSelection() {
		List<ChartSimple> firstEquityChart = chartData.getChart().get(0).getEquityChart();
		first = firstEquityChart.get(0).getValue();
		List<ChartSimple> lastEquityChart = chartData.getChart().get(chartData.getChart().size() - 1).getEquityChart();
		selected = lastEquityChart.get(lastEquityChart.size() - 1).getValue();
//		getViewState().hideHighlight();
		updateValues();
	}

	public void onPortfolioChartTouch(int index, float chartBottomY) {
//		selected = chartData.getProfitChart().get(index).getValue();

		updateValues();
	}

	private void updateValues() {
		if (first == null || selected == null || baseCurrency == null)
			return;

		getViewState().setAmount(StringFormatUtil.getGvtValueString(selected), StringFormatUtil.getBaseValueString(selected * chartData.getRate(), baseCurrency.getValue()));
//		getViewState().setAmount(StringFormatUtil.getGvtValueString(selected), StringFormatUtil.getBaseValueString(selected * 7, baseCurrency.getValue()));

		Double changeValue = selected - first;
		getViewState().setChange(changeValue < 0, StringFormatUtil.getChangePercentString(first, selected),
				StringFormatUtil.getChangeValueString(changeValue), StringFormatUtil.getBaseValueString(changeValue * chartData.getRate(), baseCurrency.getValue()));
//		getViewState().setChange(changeValue < 0, StringFormatUtil.getChangePercentString(first, selected),
//				StringFormatUtil.getChangeValueString(changeValue), StringFormatUtil.getBaseValueString(changeValue * 7, baseCurrency.getValue()));
	}

	@Override
	public void onDateRangeChanged(DateRange dateRange) {
		this.chartDateRange = dateRange;
		getViewState().setDateRange(dateRange);
		getViewState().showProgress(true);
		getChartData();
	}
}