package org.crazyit.s02.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ms.R;

public class SpinnerTest extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		BaseAdapter ba = new BaseAdapter()
		{
			@Override
			public int getCount()
			{
				//指定一共包含10个选项
				return 10;
			}

			@Override
			public Object getItem(int position)
			{
				return null;
			}

			@Override
			public long getItemId(int position)
			{
				// TODO Auto-generated method stub
				return 0;
			}
//			//重写该方法，该方法返回的View将作为列表框的每项
//			@Override
//			public View getView(int position, View convertView, ViewGroup parent) 
//			{
//				TextView text = new TextView(SpinnerTest2.this);
//				text.setText(position"");
//				text.setTextSize(20);
//				text.setTextColor(R.color.red);
//				return text;
//			}
			//重写该方法，该方法返回的View将作为列表框的每项
			@Override
			public View getView(int position, View convertView, ViewGroup parent) 
			{
				//创建一个LinearLayout，并向其中添加2个组件
				LinearLayout line = new LinearLayout(SpinnerTest.this);
				line.setOrientation(0);
				ImageView image = new ImageView(SpinnerTest.this);
				image.setImageResource(R.drawable.icon);
				TextView text = new TextView(SpinnerTest.this);
				text.setText(position + "");
				text.setTextSize(20);
				text.setTextColor(getResources().getColor(R.color.red));
				line.addView(image);
				line.addView(text);
				//返回LinearLayout实例
				return line;
			}		
		};
		Spinner spinner = (Spinner)findViewById(R.id.spinner);
		spinner.setAdapter(ba);
		
		
	}

}
