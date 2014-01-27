package cn.eoe.animation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	private ImageView iv;
//	private AlphaAnimation aa;
	private Animation aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		aa = new AlphaAnimation(1, 0);
//		aa.setDuration(2000);
//		aa.setFillAfter(true);
		
		aa = AnimationUtils.loadAnimation(this, R.anim.aa);
		aa.setAnimationListener(new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				Toast.makeText(MainActivity.this, "Animation complete", Toast.LENGTH_SHORT).show();
			}
		});
		
		iv = (ImageView) findViewById(R.id.iv);
		iv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				iv.startAnimation(aa);
				
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
