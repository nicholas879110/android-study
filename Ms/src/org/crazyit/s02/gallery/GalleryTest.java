package org.crazyit.s02.gallery;

import com.example.ms.R;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryTest extends Activity {
	
	int[] imageIds = new int[]
			{
				R.drawable.shuangzi, R.drawable.shuangyu,
				R.drawable.chunv, R.drawable.tiancheng, R.drawable.tianxie,
				R.drawable.sheshou, R.drawable.juxie, R.drawable.shuiping,
				R.drawable.shizi, R.drawable.baiyang, R.drawable.jinniu,
				R.drawable.mojie };
	
	Gallery gallery;
	ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_gallery);
		gallery =(Gallery) findViewById(R.id.gallery);
		imageView=(ImageView)findViewById(R.id.imageview_gallery);
		BaseAdapter adapter=new BaseAdapter() {
			
			@Override
			public View getView(int arg0, View arg1, ViewGroup arg2) {
				// TODO Auto-generated method stub
				ImageView image=new ImageView(GalleryTest.this);
				image.setImageResource(imageIds[arg0]);
				image.setScaleType(ImageView.ScaleType.FIT_XY);
				image.setLayoutParams(new Gallery.LayoutParams(75,100));
				TypedArray typedArray=obtainStyledAttributes(R.styleable.Gallery);
				image.setBackgroundResource(typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground, 0));
				return image;
			}
			
			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
			
			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return imageIds.length;
			}
		};
		
		gallery.setAdapter(adapter);
		gallery.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				imageView.setImageResource(imageIds[arg2]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	}

}
