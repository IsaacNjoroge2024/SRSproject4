
	 
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
import android.widget.TextView;
import android.content.Intent;

public class android_large___9_activity extends Activity {

	
	private View _bg__android_large___9_ek2;
	private ImageView __img___icon__battery__ek2;
	private ImageView __img___icon__wifi__ek3;
	private ImageView __img___icon__network__ek3;
	private ImageView __img___icon__speaker__ek3;
	private TextView txt_12_30_ek4;
	private ImageView __img___icon__recycle_6__ek3;
	private View rectangle_35;
	private View _rectangle_36;
	private TextView srs_project;
	private TextView smart_recycle_;
	private TextView log_in;
	private TextView enter_number;
	private TextView _enter;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___9);

		
		_bg__android_large___9_ek2 = (View) findViewById(R.id._bg__android_large___9_ek2);
		__img___icon__battery__ek2 = (ImageView) findViewById(R.id.__img___icon__battery__ek2);
		__img___icon__wifi__ek3 = (ImageView) findViewById(R.id.__img___icon__wifi__ek3);
		__img___icon__network__ek3 = (ImageView) findViewById(R.id.__img___icon__network__ek3);
		__img___icon__speaker__ek3 = (ImageView) findViewById(R.id.__img___icon__speaker__ek3);
		txt_12_30_ek4 = (TextView) findViewById(R.id.txt_12_30_ek4);
		__img___icon__recycle_6__ek3 = (ImageView) findViewById(R.id.__img___icon__recycle_6__ek3);
		rectangle_35 = (View) findViewById(R.id.rectangle_35);
		_rectangle_36 = (View) findViewById(R.id._rectangle_36);
		srs_project = (TextView) findViewById(R.id.srs_project);
		smart_recycle_ = (TextView) findViewById(R.id.smart_recycle_);
		log_in = (TextView) findViewById(R.id.log_in);
		enter_number = (TextView) findViewById(R.id.enter_number);
		_enter = (TextView) findViewById(R.id._enter);
	
		
		_rectangle_36.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_enter.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	