package com.metikulous.list;

import java.util.List;

import android.app.ActionBar.LayoutParams;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	showResult[] localArray;
	List<String> li;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	private EditText getEditText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void btnSubmitClicked(View v) {
		Toast.makeText(getBaseContext(), "showresult.", Toast.LENGTH_SHORT)
				.show();

		EditText txtTest;
		txtTest = (EditText) findViewById(R.layout.);

		// edited code
		final RelativeLayout rl = (RelativeLayout) findViewById(R.id.Text_id);
		final RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				(int) LayoutParams.WRAP_CONTENT,
				(int) LayoutParams.WRAP_CONTENT);
		params.leftMargin = 10;
		params.topMargin = 150;

		Button show = (Button) findViewById(R.id.btnSubmit_id);
		final ListView list = new ListView(this);

		li = new list_array<String>();
		li.add("List 1");
		li.add("List 2");
		li.add("List 3");
		li.add("List 4");
		li.add("List 5");

		show.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				ArrayAdapter<String> adp = new ArrayAdapter<String>(
						getBaseContext(),
						android.R.layout.simple_dropdown_item_1line, li);
				adp.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

				list.setAdapter(adp);
				list.setLayoutParams(params);

				rl.addView(list);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// till here

}
