package cn.eoe.myproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import cn.eoe.myproject.atys.AppMain;
import cn.eoe.myproject.ui.funcs.FuncsAdapter;

public class MainActivity extends FragmentActivity {

	private ImageView ivWelcome;
	private AlphaAnimation welcomeAnim;

	private ViewPager vpFuncs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		welcomeAnim = new AlphaAnimation(1, 0);
		welcomeAnim.setStartOffset(2000);
		welcomeAnim.setDuration(1000);

		ivWelcome = (ImageView) findViewById(R.id.ivWelcome);
		ivWelcome.startAnimation(welcomeAnim);
		welcomeAnim.setAnimationListener(new Animation.AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
			}

			@Override
			public void onAnimationEnd(Animation animation) {
				ivWelcome.setVisibility(View.GONE);
			}
		});

		vpFuncs = (ViewPager) findViewById(R.id.vpFuncs);
		vpFuncs.setAdapter(new FuncsAdapter(getSupportFragmentManager()));
		
		SharedPreferences sp = getPreferences(MODE_PRIVATE);
		if(sp.getBoolean("shown", false)){
			startActivity(new Intent(this, AppMain.class));
			finish();
		}else{
			Editor e = sp.edit();
			e.putBoolean("shown", true);
			e.commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
