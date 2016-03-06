package com.example.ms.gridlayout;

import com.example.ms.R;

import android.app.Activity;
import android.graphics.Path.FillType;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class GridLayoutTest extends Activity{
	
	
	GridLayout gridLayout;
	String chars[]={
		"7","8","9","¡Â"	,
		"4","5","6","*",
		"1","2","3","-",
		".","0","=","+"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_layout);
		gridLayout=(GridLayout)findViewById(R.id.gridlayout_root);
		
		for(int i=0;i<chars.length;i++){
			Button bn=new Button(this);
			bn.setText(chars[i]);
			bn.setTextSize(40);
			GridLayout.Spec rowSpec=GridLayout.spec(i/4+2);
			GridLayout.Spec colsSpec=GridLayout.spec(i%4);
			GridLayout.LayoutParams layoutParams=new GridLayout.LayoutParams(rowSpec, colsSpec);
			layoutParams.setGravity(Gravity.FILL);
			gridLayout.addView(bn, layoutParams);
			
		}
	}

}
