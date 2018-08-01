package vision.genesis.clientapp.feature.main.dashboard.manager;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import javax.inject.Inject;

import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.managers.ManagerDashboardManager;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 03/07/2018.
 */

@InjectViewState
public class ManagerDashboardPresenter extends MvpPresenter<ManagerDashboardView>
{
	@Inject
	public Context context;

	@Inject
	public ManagerDashboardManager dashboardManager;

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
	}

	void onResume() {
//		getInvestments();
	}

}