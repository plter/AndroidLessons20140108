package cn.eoe.myproject.ui.funcs;

import java.util.ArrayList;
import java.util.List;

import cn.eoe.myproject.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FuncsAdapter extends FragmentPagerAdapter {

	public FuncsAdapter(FragmentManager fm) {
		super(fm);
		
		list = new ArrayList<Bundle>();
		
		Bundle data;
		
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0003);
		data.putBoolean("showStartButton", false);
		list.add(data);
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0004);
		data.putBoolean("showStartButton", false);
		list.add(data);
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0001);
		data.putBoolean("showStartButton", false);
		list.add(data);
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0007);
		data.putBoolean("showStartButton", false);
		list.add(data);
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0010);
		data.putBoolean("showStartButton", false);
		list.add(data);
		data = new Bundle();
		data.putInt("imageId", R.drawable.m0011);
		data.putBoolean("showStartButton", true);
		list.add(data);
	}

	@Override
	public Fragment getItem(int arg0) {
		
//		Bundle b = new Bundle();
//		b.putInt("imageId", R.drawable.m0001);
//		b.putBoolean("showStartButton", false);
		
		Fragment f = new FuncFragment();
		f.setArguments(list.get(arg0));
		return f;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	private List<Bundle> list;
}
