package br.ufrgs.inf.sissw.app.listeners;

import android.view.View;
import android.view.View.OnClickListener;
import br.ufrgs.inf.sissw.app.InfAppActivity;

public class HomeOnClickListener implements OnClickListener {

	@Override
	public void onClick(View v) {
		InfAppActivity.goHome(v.getContext());
	}

}
