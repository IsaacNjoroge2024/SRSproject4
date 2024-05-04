
	 
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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private View rectangle_1;
	private TextView newsfeed;
	private ImageView ___img_group;
	private ImageView __img___group_29;
	private View rectangle_2;
	private TextView wallet_balance;
	private View rectangle_3;
	private ImageView vector79;
	private ImageView vector78;
	private TextView ksh_123_00;
	private TextView my_stats;
	private View rectangle_4;
	private TextView community_;
	private TextView txt_150k_items;
	private View rectangle_5;
	private TextView goal_for_2022_;
	private ImageView __img___group_27;
	private View rectangle_6;
	private ImageView __img___group_28;
	private TextView text;
	private TextView txt__3_;
	private TextView you_have_contirbuted_;
	private View img_rectangle_6;
	private ImageView __img___group_27_ek1;
	private TextView txt__14_;
	private TextView by_recieving;
	private ImageView __img___group_27_o;
	private TextView txt_12_30;
	private View rectangle_7;
	private TextView in_total__the_sr_;
	private TextView my_coupons;
	private View rectangle_8;
	private TextView coupons;
	private TextView txt_7_available_3_active;
	private View _rectangle_9;
	private ImageView vector47;
	private TextView _redeem_5;
	private View rectangle_10;
	private ImageView __img___group_28_ek1;
	private ImageView __img___group_27_ek2;
	private ImageView ___img___group_29_ek1;
	private ImageView __img___group_26;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		newsfeed = (TextView) findViewById(R.id.newsfeed);
		___img_group = (ImageView) findViewById(R.id.___img_group);
		__img___group_29 = (ImageView) findViewById(R.id.__img___group_29);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		wallet_balance = (TextView) findViewById(R.id.wallet_balance);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		vector79 = (ImageView) findViewById(R.id.vector79);
		vector78 = (ImageView) findViewById(R.id.vector78);
		ksh_123_00 = (TextView) findViewById(R.id.ksh_123_00);
		my_stats = (TextView) findViewById(R.id.my_stats);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		community_ = (TextView) findViewById(R.id.community_);
		txt_150k_items = (TextView) findViewById(R.id.txt_150k_items);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		goal_for_2022_ = (TextView) findViewById(R.id.goal_for_2022_);
		__img___group_27 = (ImageView) findViewById(R.id.__img___group_27);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		__img___group_28 = (ImageView) findViewById(R.id.__img___group_28);
		text = (TextView) findViewById(R.id.text);
		txt__3_ = (TextView) findViewById(R.id.txt__3_);
		you_have_contirbuted_ = (TextView) findViewById(R.id.you_have_contirbuted_);
		img_rectangle_6 = (View) findViewById(R.id.img_rectangle_6);
		__img___group_27_ek1 = (ImageView) findViewById(R.id.__img___group_27_ek1);
		txt__14_ = (TextView) findViewById(R.id.txt__14_);
		by_recieving = (TextView) findViewById(R.id.by_recieving);
		__img___group_27_o = (ImageView) findViewById(R.id.__img___group_27_o);
		txt_12_30 = (TextView) findViewById(R.id.txt_12_30);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		in_total__the_sr_ = (TextView) findViewById(R.id.in_total__the_sr_);
		my_coupons = (TextView) findViewById(R.id.my_coupons);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		coupons = (TextView) findViewById(R.id.coupons);
		txt_7_available_3_active = (TextView) findViewById(R.id.txt_7_available_3_active);
		_rectangle_9 = (View) findViewById(R.id._rectangle_9);
		vector47 = (ImageView) findViewById(R.id.vector47);
		_redeem_5 = (TextView) findViewById(R.id._redeem_5);
		rectangle_10 = (View) findViewById(R.id.rectangle_10);
		__img___group_28_ek1 = (ImageView) findViewById(R.id.__img___group_28_ek1);
		__img___group_27_ek2 = (ImageView) findViewById(R.id.__img___group_27_ek2);
		___img___group_29_ek1 = (ImageView) findViewById(R.id.___img___group_29_ek1);
		__img___group_26 = (ImageView) findViewById(R.id.__img___group_26);
	
		
		___img_group.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___8_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___6_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_redeem_5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___6_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		___img___group_29_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___5_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	