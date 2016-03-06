package org.crazyit.autocompletetextview;

import com.example.ms.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewTest extends Activity{
	
	AutoCompleteTextView autoCompleteTextView;
	MultiAutoCompleteTextView multiAutoCompleteTextView;
	String[] books=new String[]{"1231231","xxxada","sdsadhsahdskaj"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autocompletetextview);
		ArrayAdapter<String> arry=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, books);
		autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.auto);
		autoCompleteTextView.setAdapter(arry);
		
		multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.mauto);
		multiAutoCompleteTextView.setAdapter(arry);
		multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
		
	}

}
