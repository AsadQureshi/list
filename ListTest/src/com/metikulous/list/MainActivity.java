package com.metikulous.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
public class MainActivity extends Activity {
	
	SQLiteDatabase db1 = null;
	private static String DBNAME = "list.sqlite";
	Button   mButton;
	EditText mEdit;
	ListView mList;
	String result;
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
	            	TextView tview = (TextView)findViewById(R.id.textView);
	            	result = edit.getText().toString();
	            	tview.setText(result);
	            	
	            }
	            
	        });
	}
}

   


	
	
	