package com.myfirstgitapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	
	Button btnClick;
	
	// New comment
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnClick =(Button)findViewById(R.id.btnClick);
        
        btnClick.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {				
				Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        
        return super.onOptionsItemSelected(item);        
    }
    
        
}