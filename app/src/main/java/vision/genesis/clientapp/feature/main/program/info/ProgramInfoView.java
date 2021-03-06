package vision.genesis.clientapp.feature.main.program.info;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import io.swagger.client.model.ProgramDetailsFull;
import vision.genesis.clientapp.model.ProgramRequest;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 17/04/2018.
 */

interface ProgramInfoView extends MvpView
{
	@StateStrategyType(AddToEndSingleStrategy.class)
	void setProgramDetails(ProgramDetailsFull programDetails);

	@StateStrategyType(AddToEndSingleStrategy.class)
	void showInvestWithdrawButtons(boolean show);

	@StateStrategyType(AddToEndSingleStrategy.class)
	void showProgress(boolean show);

	@StateStrategyType(OneExecutionStateStrategy.class)
	void showInvestProgramActivity(ProgramRequest request);

	@StateStrategyType(OneExecutionStateStrategy.class)
	void showWithdrawProgramActivity(ProgramRequest request);

	void setReinvest(Boolean isReinvest);

	void showRequestsBottomSheet();

	void showSnackbarMessage(String message);

	void showLoginActivity();
}