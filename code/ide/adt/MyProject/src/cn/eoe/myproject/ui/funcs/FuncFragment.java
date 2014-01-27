package cn.eoe.myproject.ui.funcs;

import cn.eoe.myproject.R;
import cn.eoe.myproject.atys.AppMain;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class FuncFragment extends Fragment {

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.funcs_fragment, null);
		ImageView ivFunc = (ImageView) v.findViewById(R.id.ivFunc);
		Button btnStartApp = (Button) v.findViewById(R.id.btnStartApp);
		
		Bundle data = getArguments();
		ivFunc.setImageResource(data.getInt("imageId"));
		
		if (data.getBoolean("showStartButton")) {
			btnStartApp.setVisibility(View.VISIBLE);
			
			btnStartApp.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					startActivity(new Intent(getActivity(), AppMain.class));
					getActivity().finish();
				}
			});
		}else{
			btnStartApp.setVisibility(View.GONE);
		}
		
		return v;
	}
	
}
