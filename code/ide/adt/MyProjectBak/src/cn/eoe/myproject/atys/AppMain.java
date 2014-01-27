package cn.eoe.myproject.atys;

import android.app.ListActivity;
import android.os.Bundle;
import cn.eoe.myproject.R;

public class AppMain extends ListActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_main);
	}
}
