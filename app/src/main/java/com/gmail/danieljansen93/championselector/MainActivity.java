package com.gmail.danieljansen93.championselector;

import android.app.Activity;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mode_select);
	}

	public void buttonPressed(View view){
		int id = view.getId();
		if(id == R.id.v5 || id == R.id.v3){
			chooseMode(view);
		}else if(id == R.id.blueSideButton || id == R.id.redSideButton){
			chooseSide(view);
		}
	}

	public void onClick(View view){
		ImageView imageview = (ImageView)view;
		imageview.setImageDrawable(getResources().getDrawable(R.drawable.champion_katarina, getTheme()));
		view.getBackground().clearColorFilter();
	}

	private void chooseMode(View v){
		setContentView(R.layout.side_select);
		findViewById(R.id.blueSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFF0000CC));
		findViewById(R.id.redSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFFCC0000));
	}

	private void chooseSide(View v){
		setContentView(R.layout.champion_select);

		int[] left = {R.id.left_1, R.id.left_2, R.id.left_3, R.id.left_4, R.id.left_5};
		int[] right = {R.id.right_1, R.id.right_2, R.id.right_3, R.id.right_4, R.id.right_5};

		int[] blue = {R.id.blue_1, R.id.blue_2, R.id.blue_3, R.id.blue_4, R.id.blue_5};
		int[] red = {R.id.red_1, R.id.red_2, R.id.red_3, R.id.red_4, R.id.red_5};

		if(v.getId() == R.id.blueSideButton){
			for(int i = 0; i<left.length; i++){
				findViewById(left[i]).setId(blue[i]);
				findViewById(right[i]).setId(red[i]);
			}
		}else{
			for(int i = 0; i<left.length; i++){
				findViewById(right[i]).setId(blue[i]);
				findViewById(left[i]).setId(red[i]);
			}
		}

		//findViewById(R.id.red_1).getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFF242424));
		((View)findViewById(R.id.red_1).getParent()).setBackgroundTintMode(PorterDuff.Mode.MULTIPLY);

	}
}
