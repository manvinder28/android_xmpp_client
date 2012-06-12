package nl.sison.xmpp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class XMPPMainActivity extends Activity {

	private static final String TAG = "XMPPMainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// screen size detection // TODO - use this info to deploy fragments
		int layout_size = (getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK);
		if (layout_size == Configuration.SCREENLAYOUT_SIZE_SMALL) {
			makeToast("SCREENLAYOUT_SIZE_SMALL");
		} else if (layout_size == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
			makeToast("SCREENLAYOUT_SIZE_NORMAL");
		} else if (layout_size == Configuration.SCREENLAYOUT_SIZE_LARGE) {
			makeToast("SCREENLAYOUT_SIZE_LARGE");
		} else if (layout_size == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
			makeToast("SCREENLAYOUT_SIZE_XLARGE");
		} else if (layout_size == Configuration.SCREENLAYOUT_SIZE_UNDEFINED) {
			makeToast("SCREENLAYOUT_SIZE_UNDEFINED");
		}

		// TODO - test and implement if small screen etc. otherwise,
		// DoublePanel... TriplePanel, combine the screen size detection
		// TODO - determine a faster way to pass on the extras
		Intent intent = new Intent(this, SinglePanelActivity.class);
		Bundle bundle = intent.getExtras();
		if (!bundle.isEmpty()) {
			intent.putExtra(XMPPNotificationService.JID,
					bundle.getString(XMPPNotificationService.JID));
			intent.putExtra(XMPPNotificationService.KEY_BUDDY_INDEX,
					bundle.getLong(XMPPNotificationService.KEY_BUDDY_INDEX));
			intent.putExtra(XMPPNotificationService.THREAD,
					bundle.getString(XMPPNotificationService.THREAD));
		}
		startActivity(intent);
	}

	@Override
	protected void onResume() {
		super.onResume();
		// TODO detect if this is the last screen, then finish.
		finish();
	}

	@Deprecated
	private void makeToast(String message) {
		if (!BuildConfig.DEBUG)
			return;
		Log.i(TAG, message);
		Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
		toast.show();
	}
}
