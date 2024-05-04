
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Sunday 21st of August 2022 04:19:41 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class android_large___3_activity extends Activity {

	
	private View _bg__android_large___3_ek2;
	private View rectangle_10_11;
	private ImageView ___img___icon__news_;
	private ImageView ___img___emoji__location_;
	private ImageView ___img___icon__wallet_;
	private ImageView __img___icon__qrcode_scan_;
	private ImageView _screen_recording;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___3);

		
		_bg__android_large___3_ek2 = (View) findViewById(R.id._bg__android_large___3_ek2);
		rectangle_10_11 = (View) findViewById(R.id.rectangle_10_11);
		___img___icon__news_ = (ImageView) findViewById(R.id.___img___icon__news_);
		___img___emoji__location_ = (ImageView) findViewById(R.id.___img___emoji__location_);
		___img___icon__wallet_ = (ImageView) findViewById(R.id.___img___icon__wallet_);
		__img___icon__qrcode_scan_ = (ImageView) findViewById(R.id.__img___icon__qrcode_scan_);
		_screen_recording = (ImageView) findViewById(R.id._screen_recording);
	
		
		___img___icon__news_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___emoji__location_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___icon__wallet_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_screen_recording.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	