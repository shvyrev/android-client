package vision.genesis.clientapp.utils;

import android.content.Context;
import android.os.Vibrator;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 18/06/2018.
 */
public class VibrationUtil
{
	public static void vibrateRightPin(Context context) {
		vibrateOnce(context, 100);
	}

	public static void vibrateWrongPin(Context context) {
		vibrateOnce(context, 400);
	}

	public static void vibrateResetPin(Context context) {
		vibrateOnce(context, 700);
	}

	private static void vibrateOnce(Context context, int millis) {
		Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		if (vibrator != null && vibrator.hasVibrator()) {
			vibrator.vibrate(millis);
		}
	}
}
