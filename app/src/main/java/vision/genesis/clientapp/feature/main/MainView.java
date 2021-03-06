package vision.genesis.clientapp.feature.main;

import com.arellomobile.mvp.MvpView;

import vision.genesis.clientapp.feature.BaseFragment;
import vision.genesis.clientapp.feature.main.message.MessageBottomSheetDialog;
import vision.genesis.clientapp.model.AppUpdateModel;
import vision.genesis.clientapp.model.FundDetailsModel;
import vision.genesis.clientapp.model.ProgramDetailsModel;
import vision.genesis.clientapp.model.ProgramRequest;

/**
 * GenesisVision
 * Created by Vitaly on 1/19/18.
 */

public interface MainView extends MvpView
{
	void addFragmentToBackstack(BaseFragment fragment);

	void showFragment(BaseFragment fragment);

	void hideFragment(BaseFragment fragment);

	void removeFragmentFromBackstack();

	void showBottomNavigation(Boolean animate);

	void hideBottomNavigation();

	void setNavigationItemSelected(int position);

	void showSignInButton();

	void hideSignInButton();

	void showLoginActivity();

	void showInvestmentProgramDetails(ProgramDetailsModel programDetailsModel);

	void showFundDetails(FundDetailsModel fundDetailsModel);

	void showWithdrawProgram(ProgramRequest request);

	void showMessageDialog(int imageResourceId, String title, String message, boolean mustRead, MessageBottomSheetDialog.OnButtonClickListener listener);

	void showAppUpdateDialog(AppUpdateModel model);

	void showEnableTwoFactor();

	void showSetupTwoFactorActivity();

	void showDisableTwoFactorActivity();

	void showLockScreen(boolean allowFingerprint);

	void hideSplashScreen();

	void changeThemeWithAnim();
}
