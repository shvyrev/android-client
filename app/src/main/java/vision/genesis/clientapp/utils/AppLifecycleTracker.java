package vision.genesis.clientapp.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import timber.log.Timber;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.managers.SettingsManager;
import vision.genesis.clientapp.model.events.ShowLockScreenEvent;
import vision.genesis.clientapp.ui.common.BlockScreenHolder;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 20/06/2018.
 */

public class AppLifecycleTracker implements Application.ActivityLifecycleCallbacks
{
	private static final String TAG = "AppLifecycleTracker";

	@Inject
	public SettingsManager settingsManager;

	private int numberActivitiesStart = 0;

	private long appBackgroundTime = 0;

	public AppLifecycleTracker() {
		GenesisVisionApplication.getComponent().inject(this);
	}

	@Override
	public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
		Timber.d("TEST %s created", activity.getClass().getSimpleName());
	}

	@Override
	public void onActivityStarted(Activity activity) {
		Timber.d("TEST %s started", activity.getClass().getSimpleName());
		if (numberActivitiesStart == 0) {
			// The application come from background to foreground
			Log.d(TAG, "AppController status > onActivityStarted:  app went to foreground");

			if (settingsManager.isScreenLockEnabled() && appBackgroundTime != 0
					&& (System.currentTimeMillis() - appBackgroundTime) > Constants.MILLISECONDS_IN_BACKGROUND_TO_LOCK) {
				EventBus.getDefault().post(new ShowLockScreenEvent());
			}
		}
		numberActivitiesStart++;
	}

	@Override
	public void onActivityResumed(Activity activity) {
		Timber.d("TEST %s resumed", activity.getClass().getSimpleName());

		if (activity instanceof BlockScreenHolder)
			((BlockScreenHolder) activity).hideBlock();
	}

	@Override
	public void onActivityPaused(Activity activity) {
		Timber.d("TEST %s paused", activity.getClass().getSimpleName());

		if (settingsManager.isScreenLockEnabled() && activity instanceof BlockScreenHolder)
			((BlockScreenHolder) activity).showBlock();
	}

	@Override
	public void onActivityStopped(Activity activity) {
		Timber.d("TEST %s stopped", activity.getClass().getSimpleName());
		numberActivitiesStart--;
		if (numberActivitiesStart == 0) {
			// The application go from foreground to background
			Log.d(TAG, "AppController status > onActivityStopped: app went to background");
			appBackgroundTime = System.currentTimeMillis();


		}
	}

	@Override
	public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

	}

	@Override
	public void onActivityDestroyed(Activity activity) {
		Timber.d("TEST %s destroyed", activity.getClass().getSimpleName());
	}
}