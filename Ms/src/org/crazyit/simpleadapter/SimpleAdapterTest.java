package org.crazyit.simpleadapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/**
 * Description:
 * <br/>site: <a href="http://www.crazyit.org">crazyit.org</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class SimpleAdapterTest extends Activity
{
	private String[] names = new String[]
		{ "虎头", "弄玉", "李清照", "李白"};
	private int[] imageIds = new int[]
		{ R.drawable.tiger , R.drawable.nongyu
			, R.drawable.qingzhao , R.drawable.libai};
	private String[] desp=new String[]{"tiger","nongyu","liqingzhao","libai" };
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simpleadapter);
		//创建一个List集合，List集合的元素是Map
		List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < names.length; i++)
		{
			Map<String, Object> listItem = new HashMap<String, Object>();
			listItem.put("header", imageIds[i]);
			listItem.put("name", names[i]);
			listItem.put("desp", desp[i]);
			listItems.add(listItem);
		}
		//创建一个SimpleAdapter
		SimpleAdapter simpleAdapter = new SimpleAdapter(this
			, listItems 
			, R.layout.activity_simpleadapter_item
			, new String[]{ "name", "header","desp" }
			, new int[]{R.id.name,R.id.header , R.id.desp});
		ListView list = (ListView)findViewById(R.id.mylist);
		//为ListView设置Adapter
		list.setAdapter(simpleAdapter);
		
//		list.setOnItemClickListener(new OnItemClickListener() {
//		
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view, int position,
//					long id) {
//				// TODO Auto-generated method stub
//				System.out.println("点击 "+names[position]);
//			}
//			
//		});
//		
		list.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				System.out.println("点击 "+names[arg2]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}