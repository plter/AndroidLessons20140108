package cn.eoe.customanim;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class CustomAnim extends Animation {

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		
		
//		t.setAlpha(1-interpolatedTime);
//		t.getMatrix().setTranslate(0, 200*interpolatedTime);
		t.getMatrix().setTranslate( (float) (50 * Math.sin(interpolatedTime*30)) , 0);
		
//		System.out.println(interpolatedTime);
		
	}
}
