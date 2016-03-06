package org.crazyit.gridview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.example.ms.R;

public class GridViewTest extends Activity {

	GridView grid;
	ImageView image;

	int[] imageIds = new int[] { R.drawable.bomb5, R.drawable.bomb6,
			R.drawable.bomb7, R.drawable.bomb8, R.drawable.bomb9,
			R.drawable.bomb10, R.drawable.bomb11, R.drawable.bomb12,
			R.drawable.bomb13, R.drawable.bomb14, R.drawable.bomb15,
			R.drawable.bomb16 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gridview);

		List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < imageIds.length; i++) {
			Map<String, Object> listItem = new HashMap<String, Object>();
			listItem.put("image", imageIds[i]);
			listItems.add(listItem);
		}

		image = (ImageView) findViewById(R.id.image01);
		SimpleAdapter simpleAdapter = new SimpleAdapter(this,
				listItems
				// ʹ��/layout/cell.xml�ļ���Ϊ���沼��
				, R.layout.cell, new String[] { "image" },
				new int[] { R.id.image001 });

		GridView grid = (GridView) findViewById(R.id.grid01);

		grid.setAdapter(simpleAdapter);

		// ����б��ѡ�еļ�����
		grid.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// ��ʾ��ǰ��ѡ�е�ͼƬ
				image.setImageResource(imageIds[position % imageIds.length]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
			}
		});
		// ����б�������ļ�����
		grid.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// ��ʾ��������ͼƬ��ͼƬ
				image.setImageResource(imageIds[position % imageIds.length]);
			}
		});

	}

}
