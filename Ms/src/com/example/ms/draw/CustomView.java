package com.example.ms.draw;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class CustomView extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draw);
		// ��ȡ�����ļ��е�LinearLayout����
		//LinearLayout root = (LinearLayout) findViewById(R.id.root);
		// ����DrawView���
//		final DrawView draw = new DrawView(this);
		// �����Զ������������ȡ��߶�
//		draw.setMinimumWidth(300);
//		draw.setMinimumHeight(500);
		// Ϊdraw�����Touch�¼�
//		draw.setOnTouchListener(new OnTouchListener() {
//			@Override
//			public boolean onTouch(View arg0, MotionEvent event) {
//				// �޸�draw�����currentX��currentY��������
//				draw.currentX = event.getX();
//				draw.currentY = event.getY();
//				// ֪ͨdraw����ػ�
//				draw.invalidate();
//				// ����true�����������Ѿ�������¼�
//				return true;
//			}
//		});
//		root.addView(draw);
	}

}
