package vision.genesis.clientapp.feature.main.program.details;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.swagger.client.model.InvestmentProgramDetails;
import timber.log.Timber;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.BaseSwipeBackActivity;
import vision.genesis.clientapp.feature.main.program.invest.InvestDialog;
import vision.genesis.clientapp.feature.main.program.requests.RequestsActivity;
import vision.genesis.clientapp.feature.main.program.withdraw.WithdrawProgramActivity;
import vision.genesis.clientapp.model.ProgramWithdrawalRequest;
import vision.genesis.clientapp.ui.AvatarView;
import vision.genesis.clientapp.ui.PeriodLeftView;
import vision.genesis.clientapp.ui.ProfitChartView;
import vision.genesis.clientapp.ui.ToolbarView;
import vision.genesis.clientapp.utils.DateTimeUtil;

/**
 * GenesisVision
 * Created by Vitaly on 1/26/18.
 */

public class ProgramDetailsActivity extends BaseSwipeBackActivity implements ProgramDetailsView
{
	private static String EXTRA_PROGRAM_ID = "extra_program_id";

	public static void startWith(Activity activity, UUID programId) {
		Intent intent = new Intent(activity, ProgramDetailsActivity.class);
		intent.putExtra(EXTRA_PROGRAM_ID, programId);
		activity.startActivity(intent);
		activity.overridePendingTransition(R.anim.activity_slide_from_right, R.anim.hold);
	}

	@BindView(R.id.toolbar)
	public ToolbarView toolbar;

	@BindView(R.id.program_logo)
	public AvatarView programLogo;

	@BindView(R.id.title)
	public TextView title;

	@BindView(R.id.text_description)
	public TextView description;

	@BindView(R.id.chart)
	public ProfitChartView chart;

	@BindView(R.id.text_deposit_text)
	public TextView depositText;

	@BindView(R.id.text_trades_text)
	public TextView tradesText;

	@BindView(R.id.text_period_text)
	public TextView periodText;

	@BindView(R.id.text_profit_text)
	public TextView profitText;

	@BindView(R.id.text_end_of_period)
	public TextView endOfPeriodText;

	@BindView(R.id.view_period_left)
	public PeriodLeftView periodLeftView;

	@BindView(R.id.text_success_fee)
	public TextView successFeeText;

	@BindView(R.id.text_management_fee)
	public TextView managementFeeText;

	@BindView(R.id.text_investors_count)
	public TextView investorsCountText;

	@BindView(R.id.text_available_to_invest)
	public TextView availableToInvestText;

	@BindView(R.id.text_available_currency)
	public TextView availableToInvestCurrencyText;

	@BindView(R.id.group_buttons)
	public ViewGroup buttonsGroup;

	@BindView(R.id.button_invest)
	public View investButton;

	@BindView(R.id.button_withdraw)
	public View withdrawButton;

	@BindView(R.id.button_requests)
	public View requestsButton;

	@BindView(R.id.scrollview)
	public View scrollView;

	@BindView(R.id.progress_bar)
	public ProgressBar progressBar;

	@InjectPresenter
	ProgramDetailsPresenter programDetailsPresenter;

	private InvestmentProgramDetails programDetails;

	private InvestDialog investDialog;

	@OnClick(R.id.button_invest)
	public void onInvestClicked() {
		programDetailsPresenter.onInvestClicked();
	}

	@OnClick(R.id.button_withdraw)
	public void onWithdrawClicked() {
		ProgramWithdrawalRequest withdrawalRequest = new ProgramWithdrawalRequest();
		withdrawalRequest.programId = programDetails.getId();
		withdrawalRequest.programName = programDetails.getTitle();
		WithdrawProgramActivity.startWith(this, withdrawalRequest);
	}

	@OnClick(R.id.button_requests)
	public void onRequestsClicked() {
		RequestsActivity.startWith(this, programDetails.getId());
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_program_details);

		ButterKnife.bind(this);

		initToolbar();

		if (getIntent().getExtras() != null && !getIntent().getExtras().isEmpty()) {
			UUID programId = (UUID) getIntent().getExtras().getSerializable(EXTRA_PROGRAM_ID);
			programDetailsPresenter.setProgramId(programId);
		}
		else {
			Timber.e("Passed empty program to ProgramDetailsActivity");
			onBackPressed();
		}
	}

	private void initToolbar() {
		toolbar.setTitle(getString(R.string.program_details));
		toolbar.addLeftButton(R.drawable.ic_chevron_left_black_24dp, this::onBackPressed);
	}

	@Override
	protected void onResume() {
		super.onResume();
		programDetailsPresenter.onResume();
	}

	@Override
	public void onBackPressed() {
		finishActivity();
	}

	@Override
	public void setProgram(InvestmentProgramDetails programDetails) {
		this.programDetails = programDetails;

		programLogo.setImage(programDetails.getLogo());
		programLogo.setLevel(programDetails.getLevel());

		title.setText(programDetails.getTitle());
		description.setText(programDetails.getDescription());

//		chart.setData(program.chartData);

		depositText.setText(String.valueOf(programDetails.getBalance()));
		tradesText.setText(String.valueOf(programDetails.getTradesCount()));
		periodText.setText(String.valueOf(programDetails.getPeriodDuration()));
		profitText.setText(String.format(Locale.getDefault(), "%.2f%%", programDetails.getProfitAvg()));

		DecimalFormat df = new DecimalFormat("0.####");
		df.setRoundingMode(RoundingMode.DOWN);

		endOfPeriodText.setText(DateTimeUtil.formatDateTime(programDetails.getEndOfPeriod()));
		periodLeftView.setDateTo(programDetails.getEndOfPeriod());

		successFeeText.setText(df.format(programDetails.getFeeSuccess()));
		managementFeeText.setText(df.format((programDetails.getFeeManagement())));
		investorsCountText.setText(String.valueOf(programDetails.getInvestorsCount()));
		availableToInvestText.setText(df.format(programDetails.getAvailableInvestment()));
		availableToInvestCurrencyText.setText(programDetails.getCurrency().toString());

		investButton.setVisibility(programDetails.isIsInvestEnable() ? View.VISIBLE : View.GONE);
		withdrawButton.setVisibility(programDetails.isIsWithdrawEnable() ? View.VISIBLE : View.GONE);
		requestsButton.setVisibility(programDetails.isHasNewRequests() ? View.VISIBLE : View.GONE);
	}

	@Override
	public void showInvestDialog() {
		if (investDialog != null)
			investDialog.cancel();
		investDialog = new InvestDialog(this, true, null);
		investDialog.setProgram(programDetails);
		investDialog.show();
	}

	@Override
	public void showInvestWithdrawButtons(boolean show) {
		buttonsGroup.setVisibility(show ? View.VISIBLE : View.GONE);
	}

	@Override
	public void showProgress(boolean show) {
		progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
		scrollView.setVisibility(!show ? View.VISIBLE : View.GONE);
	}

	@Override
	public void finishActivity() {
		finish();
		overridePendingTransition(R.anim.hold, R.anim.activity_slide_to_right);
	}
}