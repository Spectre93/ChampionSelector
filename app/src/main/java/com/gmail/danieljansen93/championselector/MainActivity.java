package com.gmail.danieljansen93.championselector;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mode_select);
	}

	public void buttonPressed(View view){
		switch(view.getId()){
			case R.id.v3:
				break;
			case R.id.v5:
				break;

		}
	}
}
