package cn.eoe.startactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
	
	
	private TextView tvOutput;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_activity);
		
		String str = getIntent().getStringExtra("data");
		
		tvOutput = (TextView) findViewById(R.id.tvOutput);
		tvOutput.setText(str);
	}
}
