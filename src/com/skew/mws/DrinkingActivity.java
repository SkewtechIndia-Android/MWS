package com.skew.mws;

import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DrinkingActivity extends ActionBarActivity {
	Button ronormalmonthly;
	Button rochilledmonthly;
	Button ronormaljar;
	Button rochilledjar;
	public static Map ordermap;
	float ronormalmonthly_deposit = 300;
	float rochilledmonthly_deposit = 500;
	float ronormaljar_deposit = 500;
	float rochilledjar_deposit = 500;
	String order_val_string;
	String temp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drinking);
		ronormalmonthly = (Button) findViewById(R.id.ronormalmonthly);
		ronormalmonthly.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				  Intent intent = new Intent(getApplicationContext(),OrderActivity.class);
			/*	  order_val_string = 
				  ordermap.put(ronormalmonthly, "");
			*/	  startActivity(intent);
				  finish();
			}
		});
		rochilledmonthly = (Button) findViewById(R.id.rochilledmonthly);
		rochilledmonthly.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				  Intent intent = new Intent(getApplicationContext(),OrderActivity.class);
				  startActivity(intent);
				  finish();
			}
		});
		ronormaljar = (Button) findViewById(R.id.ronormaljar);
		ronormaljar.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				  Intent intent = new Intent(getApplicationContext(),DrinkingActivity.class);
				  startActivity(intent);
				  finish();
			}
		});
		rochilledjar = (Button) findViewById(R.id.rochilledjar);
		rochilledjar.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				  Intent intent = new Intent(getApplicationContext(),DrinkingActivity.class);
				  startActivity(intent);
				  finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drinking, menu);
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
