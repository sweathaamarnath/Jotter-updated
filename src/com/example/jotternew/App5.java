package com.example.jotternew;


import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class App5 extends ActionBarActivity {
 
	Button button; 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app5);
		home();
		
		
		
	}
	
	public void home()
	{
		final Context context = this;
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, MainActivity.class);
                            startActivity(intent);   
 
			}
		});
		
	}
	
	
	
	

	
}