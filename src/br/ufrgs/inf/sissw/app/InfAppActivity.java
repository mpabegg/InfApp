package br.ufrgs.inf.sissw.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class InfAppActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.main);
	}

	public static void goHome(Context context) {
		final Intent intent = new Intent(context, InfAppActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		context.startActivity(intent);
	}

	public void onClickFeature(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.button_ru:
			startActivity(new Intent(getApplicationContext(), RuActivity.class));
			break;
		case R.id.button_twitter:
			startActivity(new Intent(getApplicationContext(),
					TwitterActivity.class));
			break;
		default:
			break;
		}
	}
}