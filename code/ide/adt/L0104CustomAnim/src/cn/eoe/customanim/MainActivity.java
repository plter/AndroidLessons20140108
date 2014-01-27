package cn.eoe.customanim;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	private Button btnClickMe;
	private CustomAnim anim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		anim = new CustomAnim();
		anim.setDuration(2000);
		
		btnClickMe = (Button) findViewById(R.id.btnClickMe);
		btnClickMe.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnClickMe.startAnimation(anim);
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
