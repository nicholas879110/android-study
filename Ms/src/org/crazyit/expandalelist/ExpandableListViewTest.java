package org.crazyit.expandalelist;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ms.R;

public class ExpandableListViewTest extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expandablelist);
		
		ExpandableListAdapter adapter=new ExpandableListAdapter() {
			
			int[] logos = new int[]
					{
						R.drawable.p,
						R.drawable.z,
						R.drawable.t
					};
		 			private String[] armTypes = new String[]
						{ "�������", "�������", "�������"};
					private String[][] arms = new String[][]
					{
						{ "��սʿ", "����ʿ", "�ڰ�ʥ��", "���" },
						{ "С��", "����", "����", "�Ա��ɻ�" },
						{ "��ǹ��", "��ʿMM" , "����" }
					};
			
			
			@Override
			public void unregisterDataSetObserver(DataSetObserver arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void registerDataSetObserver(DataSetObserver arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onGroupExpanded(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onGroupCollapsed(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isChildSelectable(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean hasStableIds() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public View getGroupView(int groupPosition, boolean arg1, View arg2, ViewGroup arg3) {
				// TODO Auto-generated method stub
				LinearLayout ll = new LinearLayout(ExpandableListViewTest.this);
				ll.setOrientation(0);
				ImageView logo = new ImageView(ExpandableListViewTest.this);
				logo.setImageResource(logos[groupPosition]);
				ll.addView(logo);
				TextView textView = getTextView();
				textView.setText(getGroup(groupPosition).toString());				
				ll.addView(textView);			
				return ll;
			}
			
			@Override
			public long getGroupId(int arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
			
			@Override
			public int getGroupCount() {
				// TODO Auto-generated method stub
				return armTypes.length;
			}
			
			@Override
			public Object getGroup(int groupPosition) {
				// TODO Auto-generated method stub
				return armTypes[groupPosition];
			}
			
			@Override
			public long getCombinedGroupId(long arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getCombinedChildId(long arg0, long arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getChildrenCount(int groupPostion) {
				// TODO Auto-generated method stub
				return arms[groupPostion].length;
			}
			
			@Override
			public View getChildView(int groupPosition, int childPosition, boolean arg2, View arg3,
					ViewGroup arg4) {
				// TODO Auto-generated method stub
				TextView textView = getTextView();			
				textView.setText(getChild(groupPosition, childPosition).toString());
				return textView;
			}
			
			@Override
			public long getChildId(int groupPostion, int childPosition) {
				// TODO Auto-generated method stub
				return childPosition;
			}
			
			@Override
			public Object getChild(int groupPostion, int childPosition) {
				// TODO Auto-generated method stub
				return arms[groupPostion][childPosition];
			}
			
			@Override
			public boolean areAllItemsEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			private TextView getTextView()
			{
				AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
						ViewGroup.LayoutParams.FILL_PARENT, 64);
				TextView textView = new TextView(ExpandableListViewTest.this);
				textView.setLayoutParams(lp);
				textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
				textView.setPadding(36, 0, 0, 0);
				textView.setTextSize(20);
				return textView;
			}
		};
		
		ExpandableListView expandableListView=( ExpandableListView)findViewById(R.id.expandableListView);
		expandableListView.setAdapter(adapter);
		
		
	}

}
