package cn.eoe.startactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	private EditText etInput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etInput = (EditText) findViewById(R.id.etInput);

		findViewById(R.id.btnStartActivity).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this, MyActivity.class);
				i.putExtra("data", etInput.getText().toString());
				
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
