package com.gmail.danieljansen93.championselector;

import android.app.Activity;
import android.graphics.LightingColorFilter;
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
		switch(view.getId()){
			case R.id.v3:
				setContentView(R.layout.side_select);
				findViewById(R.id.blueSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFF0000CC));
				findViewById(R.id.redSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFFCC0000));
				break;
			case R.id.v5:
				setContentView(R.layout.side_select);
				findViewById(R.id.blueSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFF0000CC));
				findViewById(R.id.redSideButton).getBackground().setColorFilter(new LightingColorFilter(0x00000000, 0xFFCC0000));
				break;
			case R.id.redSideButton:
				setContentView(R.layout.champion_select);
				break;
			case R.id.blueSideButton:
				setContentView(R.layout.champion_select);
				break;
		}
	}

	public void onClick(View view){
		ImageView imageview = (ImageView)view;
		imageview.setImageDrawable(getResources().getDrawable(R.drawable.champion_katarina, getTheme()));
	}
}
