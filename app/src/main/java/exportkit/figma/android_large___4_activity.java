
	 
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

public class android_large___4_activity extends Activity {

	
	private View _bg__android_large___4_ek2;
	private ImageView lala_1;
	private ImageView __img___icon__battery_charging_;
	private ImageView __img___icon__wifi_;
	private ImageView __img___icon__network_;
	private ImageView __img___icon__speaker_;
	private TextView txt_12_30_ek1;
	private TextView products;
	private TextView recyclable_in_rvm;
	private ImageView __img___emoji__white_;
	private TextView brookside;
	private View rectangle_14;
	private TextView barcode;
	private View _rectangle_15;
	private TextView _where_can_i_recycle_;
	private ImageView __img___icon__recycle_5_;
	private ImageView ___img___icon__arrow_back_ios_;
	private View rectangle_10_ek1;
	private ImageView ___img___icon__news__ek1;
	private ImageView __img___emoji__location__ek1;
	private ImageView ___img___icon__wallet__ek1;
	private ImageView __img___icon__qrcode_scan__ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___4);

		
		_bg__android_large___4_ek2 = (View) findViewById(R.id._bg__android_large___4_ek2);
		lala_1 = (ImageView) findViewById(R.id.lala_1);
		__img___icon__battery_charging_ = (ImageView) findViewById(R.id.__img___icon__battery_charging_);
		__img___icon__wifi_ = (ImageView) findViewById(R.id.__img___icon__wifi_);
		__img___icon__network_ = (ImageView) findViewById(R.id.__img___icon__network_);
		__img___icon__speaker_ = (ImageView) findViewById(R.id.__img___icon__speaker_);
		txt_12_30_ek1 = (TextView) findViewById(R.id.txt_12_30_ek1);
		products = (TextView) findViewById(R.id.products);
		recyclable_in_rvm = (TextView) findViewById(R.id.recyclable_in_rvm);
		__img___emoji__white_ = (ImageView) findViewById(R.id.__img___emoji__white_);
		brookside = (TextView) findViewById(R.id.brookside);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		barcode = (TextView) findViewById(R.id.barcode);
		_rectangle_15 = (View) findViewById(R.id._rectangle_15);
		_where_can_i_recycle_ = (TextView) findViewById(R.id._where_can_i_recycle_);
		__img___icon__recycle_5_ = (ImageView) findViewById(R.id.__img___icon__recycle_5_);
		___img___icon__arrow_back_ios_ = (ImageView) findViewById(R.id.___img___icon__arrow_back_ios_);
		rectangle_10_ek1 = (View) findViewById(R.id.rectangle_10_ek1);
		___img___icon__news__ek1 = (ImageView) findViewById(R.id.___img___icon__news__ek1);
		__img___emoji__location__ek1 = (ImageView) findViewById(R.id.__img___emoji__location__ek1);
		___img___icon__wallet__ek1 = (ImageView) findViewById(R.id.___img___icon__wallet__ek1);
		__img___icon__qrcode_scan__ek1 = (ImageView) findViewById(R.id.__img___icon__qrcode_scan__ek1);
	
		
		_rectangle_15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_where_can_i_recycle_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___icon__arrow_back_ios_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___icon__news__ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___icon__wallet__ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	