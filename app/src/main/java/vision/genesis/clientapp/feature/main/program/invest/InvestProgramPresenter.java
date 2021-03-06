package vision.genesis.clientapp.feature.main.program.invest;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.Locale;

import javax.inject.Inject;

import io.swagger.client.model.ProgramInvestInfo;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.main.program.invest.confirm.ConfirmProgramInvestBottomSheetFragment;
import vision.genesis.clientapp.managers.ProgramsManager;
import vision.genesis.clientapp.managers.SettingsManager;
import vision.genesis.clientapp.model.CurrencyEnum;
import vision.genesis.clientapp.model.ProgramRequest;
import vision.genesis.clientapp.net.ApiErrorResolver;
import vision.genesis.clientapp.utils.StringFormatUtil;

/**
 * GenesisVision
 * Created by Vitaly on 2/21/18.
 */

@InjectViewState
public class InvestProgramPresenter extends MvpPresenter<InvestProgramView> implements ConfirmProgramInvestBottomSheetFragment.OnConfirmProgramInvestListener
{
	@Inject
	public Context context;

	@Inject
	public SettingsManager settingsManager;

	@Inject
	public ProgramsManager programsManager;

	private Subscription baseCurrencySubscription;

	private Subscription investInfoSubscription;

	private ProgramRequest programRequest;

	private CurrencyEnum baseCurrency;

	private Double amount;

	private ProgramInvestInfo investInfo;

	private Double availableToInvest;

	private Double entryFee;

	private Double gvCommission;

	private Double investmentAmount;

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);

		subscribeToBaseCurrency();
		getInvestInfo();
	}

	@Override
	public void onDestroy() {
		if (baseCurrencySubscription != null)
			baseCurrencySubscription.unsubscribe();
		if (investInfoSubscription != null)
			investInfoSubscription.unsubscribe();

		super.onDestroy();
	}

	void onAmountChanged(String newAmount) {
		try {
			amount = Double.parseDouble(newAmount);
			//TODO: fix newAmount == "000.000000"
		} catch (NumberFormatException e) {
			amount = 0.0;
		}
//		double fractionalPart = NumberFormatUtil.roundDouble(amount - ((long) amount.doubleValue()), StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()));
//		if (String.valueOf(fractionalPart).length() > StringFormatUtil.getCurrencyMaxFraction(CurrencyEnum.GVT.getValue()) + 2) {
//			getViewState().setAmount(newAmount.substring(0, newAmount.length() - 1));
//		}
		if (investInfo != null) {
			if (amount > availableToInvest) {
				getViewState().setAmount(StringFormatUtil.formatCurrencyAmount(availableToInvest, CurrencyEnum.GVT.getValue()));
				return;
			}

			entryFee = amount * (investInfo.getEntryFee() / 100);
			gvCommission = amount * (investInfo.getGvCommission() / 100);
			investmentAmount = amount - entryFee - gvCommission;

			getViewState().setAmountBase(getAmountBaseString());
			getViewState().setEntryFee(getEntryFeeString());
			getViewState().setGvCommission(getGvCommissionString());
			getViewState().setInvestmentAmount(getInvestmentAmountString());
			getViewState().setContinueButtonEnabled(amount >= investInfo.getMinInvestmentAmount()
					&& amount <= availableToInvest);
		}
	}

	private String getAmountBaseString() {
		return String.format(Locale.getDefault(), "= %s %s",
				StringFormatUtil.formatCurrencyAmount(amount * investInfo.getRate(), baseCurrency.getValue()),
				baseCurrency.getValue());
	}

	private String getAmountToInvestString() {
		return String.format(Locale.getDefault(), "%s GVT",
				StringFormatUtil.formatCurrencyAmount(amount, CurrencyEnum.GVT.getValue()));
	}

	private String getEntryFeeString() {
		return String.format(Locale.getDefault(), "%s%% (%s GVT)",
				StringFormatUtil.formatAmount(investInfo.getEntryFee(), 0, 2),
				StringFormatUtil.formatCurrencyAmount(entryFee, CurrencyEnum.GVT.getValue()));
	}

	private String getGvCommissionString() {
		return String.format(Locale.getDefault(), "%s%% (%s GVT)",
				StringFormatUtil.formatAmount(investInfo.getGvCommission(), 0, 5),
				StringFormatUtil.formatCurrencyAmount(gvCommission, CurrencyEnum.GVT.getValue()));
	}

	private String getInvestmentAmountString() {
		return String.format(Locale.getDefault(), "%s GVT",
				StringFormatUtil.formatCurrencyAmount(investmentAmount, CurrencyEnum.GVT.getValue()));
	}

	private String getFeesAndCommissionsString() {
		return String.format(Locale.getDefault(), "%s%% (%s GVT)",
				StringFormatUtil.formatAmount(investInfo.getEntryFee() + investInfo.getGvCommission(), 0, 5),
				StringFormatUtil.formatCurrencyAmount(entryFee + gvCommission, CurrencyEnum.GVT.getValue()));
	}

	void onMaxClicked() {
		if (investInfo != null) {
			getViewState().setAmount(StringFormatUtil.formatCurrencyAmount(availableToInvest, CurrencyEnum.GVT.getValue()));
		}
	}

	void onContinueClicked() {
		programRequest.setAmount(amount);
		programRequest.setAmountTopText(getAmountToInvestString());
		programRequest.setInfoMiddleText(getFeesAndCommissionsString());
		programRequest.setAmountBottomText(getInvestmentAmountString());
		programRequest.setPeriodEndsText(String.format(Locale.getDefault(),
				context.getString(R.string.program_invest_warning_template),
				programRequest.getProgramCurrency(), programRequest.getProgramCurrency()));
		getViewState().showConfirmDialog(programRequest);
	}

	private void subscribeToBaseCurrency() {
		baseCurrencySubscription = settingsManager.getBaseCurrency()
				.subscribeOn(Schedulers.newThread())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(this::baseCurrencyChangedHandler);
	}

	private void baseCurrencyChangedHandler(CurrencyEnum baseCurrency) {
		this.baseCurrency = baseCurrency;
		getInvestInfo();
	}

	private void getInvestInfo() {
		if (programsManager != null && programRequest != null && baseCurrency != null) {
			investInfoSubscription = programsManager.getInvestInfo(programRequest.getProgramId(), baseCurrency)
					.observeOn(AndroidSchedulers.mainThread())
					.subscribeOn(Schedulers.io())
					.subscribe(this::handleInvestInfoResponse,
							this::handleInvestInfoError);
		}
	}

	private void handleInvestInfoResponse(ProgramInvestInfo response) {
		investInfoSubscription.unsubscribe();

		investInfo = response;

//		double maxAmount = investInfo.getAvailableInWallet() / (1 + investInfo.getEntryFee() / 100);
//		availableToInvest = investInfo.getAvailableToInvest() < maxAmount
//				? investInfo.getAvailableToInvest()
//				: maxAmount;
		availableToInvest = investInfo.getAvailableToInvest() < investInfo.getAvailableInWallet()
				? investInfo.getAvailableToInvest()
				: investInfo.getAvailableInWallet();

		getViewState().showProgress(false);
		getViewState().setAvailableToInvest(availableToInvest);
		getViewState().setMinInvestmentAmount(investInfo.getMinInvestmentAmount());
		onAmountChanged("0");
	}

	private void handleInvestInfoError(Throwable throwable) {
		investInfoSubscription.unsubscribe();
		getViewState().showProgress(false);

		ApiErrorResolver.resolveErrors(throwable,
				message -> getViewState().showSnackbarMessage(message));

		getViewState().finishActivity();
	}

	public void setProgramRequest(ProgramRequest programRequest) {
		this.programRequest = programRequest;
		getInvestInfo();
	}

	@Override
	public void onInvestSucceeded() {
		getViewState().finishActivity();
	}
}
