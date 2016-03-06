package org.crazyit.arrayadapter;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterTest extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arrayadapter);
		ListView list1=(ListView)findViewById(R.id.list1);
		String array1[]=new String[]{"test1","xxxxxx2","dsadsadsa"};
		ArrayAdapter<String> arr1=new ArrayAdapter<String>(this, R.layout.array_item,array1);
		list1.setAdapter(arr1);
		
		ListView list2=(ListView)findViewById(R.id.list2);
		String array2[]=new String[]{"test11111","xxxxxx222222","dsadµÄÈöµ©Èösadsa"};
		ArrayAdapter<String> arr2=new ArrayAdapter<String>(this, R.layout.array_item,array2);
		list2.setAdapter(arr2);
		
		
	}

}
