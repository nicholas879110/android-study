package com.example.ms.quickcontact;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

public class QuickContactBadgeTest extends Activity{
	
	QuickContactBadge badge;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quick_contact);
		badge=(QuickContactBadge)findViewById(R.id.badge);
		badge.assignContactFromPhone("028-88888888", false);
		
		
	}
}
