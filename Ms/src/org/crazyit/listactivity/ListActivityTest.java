package org.crazyit.listactivity;

import com.example.ms.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListActivityTest extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		String array1[]=new String[]{"test1","xxxxxx2","dsadsadsa"};
		ArrayAdapter<String> arr1=new ArrayAdapter<String>(this, R.layout.array_item,array1);
		setListAdapter(arr1);
	}
}
