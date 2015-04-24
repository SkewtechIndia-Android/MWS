package com.skew.mws;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TankerActivity extends ActionBarActivity {

	Button ltr1500;
	Button ltr5000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tanker);
		ltr1500 = (Button) findViewById(R.id.ltr1500);
		ltr1500.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(),"1500 Order Placed" ,Toast.LENGTH_LONG).show();
			}
		});
		ltr5000 = (Button) findViewById(R.id.ltr5000);
		ltr5000.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(),"5000 Order Placed" ,Toast.LENGTH_LONG).show();
			}
		});

	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tanker, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
