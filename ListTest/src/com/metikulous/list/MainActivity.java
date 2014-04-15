package com.metikulous.list;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button   mButton;
	EditText mEdit;
	ListView mList;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    mButton = (Button)findViewById(R.id.btnSubmit);
	    mEdit   = (EditText)findViewById(R.id.textInput);

	    mButton.setOnClickListener(
	        new View.OnClickListener()
	        {
	            public void onClick(View view)
	            {
	            	EditText edit = (EditText)findViewById(R.id.textInput);
	            	TextView tview = (TextView)findViewById(R.id.listView);
	            	String result = edit.getText().toString();
	            	tview.setText(result);;    
	            }
	            
	        });
	}
}

   


	
	
	