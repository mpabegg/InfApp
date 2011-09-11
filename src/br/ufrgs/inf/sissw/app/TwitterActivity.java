package br.ufrgs.inf.sissw.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;
import br.ufrgs.inf.sissw.app.listeners.HomeOnClickListener;

public class TwitterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.twitter_activity);

		ImageButton homeButton = (ImageButton) findViewById(R.id.feature_home_button);
		homeButton.setOnClickListener(new HomeOnClickListener());
	}

}
