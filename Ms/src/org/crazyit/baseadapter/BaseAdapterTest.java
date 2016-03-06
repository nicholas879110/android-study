package org.crazyit.baseadapter;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class BaseAdapterTest extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baseadapter);
		ListView list=(ListView)findViewById(R.id.baseadapter);
		BaseAdapter adapter=new BaseAdapter() {
			
			@Override
			public View getView(int position, View view, ViewGroup parent) {
				LinearLayout line=new LinearLayout(BaseAdapterTest.this);
				line.setOrientation(0);
				ImageView image=new ImageView(BaseAdapterTest.this);
				image.setImageResource(R.drawable.ic_launcher);
				TextView text=new TextView(BaseAdapterTest.this);
				text.setText("ddii--"+position+"----dge");
				line.addView(image);
				line.addView(text);
				
				return line;
			}
			
			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
			
			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 40;
			}
		};
		list.setAdapter(adapter);
	}

}
