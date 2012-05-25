package com.sideproj.auto911;

/*
import android.app.Activity;
import android.os.Bundle;

public class Auto911CallerActivity extends Activity {
    /** Called when the activity is first created. 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}

*/

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
 
public class Auto911CallerActivity extends Activity {
 
	ImageButton imageButton;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
 
		addListenerOnButton();
 
	}
 
	public void addListenerOnButton() {
 
		imageButton = (ImageButton) findViewById(R.id.imageButton1);
 
		imageButton.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
 
			   Toast.makeText(Auto911CallerActivity.this,
				"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
 
			}
 
		});
 
	}
 
}