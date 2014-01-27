package cn.eoe.activity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private static final String TAG_ACTIVITY = "activitycircle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.i(TAG_ACTIVITY, "onCreate");
	}
	
	
	@Override
	protected void onStart() {
		
		Log.i(TAG_ACTIVITY, "onStart");
		
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		
		Log.i(TAG_ACTIVITY, "onResume");
		
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		
		Log.i(TAG_ACTIVITY, "onPause");
		
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		
		Log.i(TAG_ACTIVITY, "onStop");
		
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		
		Log.i(TAG_ACTIVITY, "onDestory");
		
		super.onDestroy();
	}
	
	@Override
	protected void onRestart() {
		
		Log.i(TAG_ACTIVITY, "onRestart");
		
		super.onRestart();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
