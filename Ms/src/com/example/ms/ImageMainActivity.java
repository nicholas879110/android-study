package com.example.ms;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageMainActivity extends Activity{
	
	//����һ������ͼƬ������
		int[] images = new int[]{
			R.drawable.java,
			R.drawable.ee,
			R.drawable.classic,
			R.drawable.ajax,
			R.drawable.xml,
		};
		int currentImg = 0;
		@Override
		public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_image);
			//��ȡLinearLayout��������
			LinearLayout main = (LinearLayout)findViewById(R.id.root);
			//���򴴽�ImageView���
			final ImageView image = new ImageView(this);
			//��ImageView�����ӵ�LinearLayout����������
			main.addView(image);
			//��ʼ��ʱ��ʾ��һ��ͼƬ
			image.setImageResource(images[0]);
			image.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (currentImg >= 4)
					{
						currentImg = -1;
					}
					//�ı�ImageView����ʾ��ͼƬ
					image.setImageResource(images[++currentImg]);
				}
			});
		}

}
