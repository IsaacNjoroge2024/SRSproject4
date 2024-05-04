
	 
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

public class android_large___7_activity extends Activity {

	
	private View _bg__android_large___7_ek2;
	private ImageView __img___icon__battery_;
	private ImageView __img___icon__wifi__ek1;
	private ImageView __img___icon__network__ek1;
	private ImageView __img___icon__speaker__ek1;
	private TextView txt_12_30_ek2;
	private ImageView __img___illustration__crypto__ek1;
	private TextView pashibei_ek1;
	private TextView investing_;
	private View rectangle_31_ek1;
	private View rectangle_32_ek1;
	private TextView id_number;
	private TextView pash_account;
	private View rectangle_33;
	private View rectangle_34;
	private TextView update;
	private TextView cancel;
	private TextView don_t_have_a;
	private TextView get_one_here;
	private ImageView ___img___icon__arrow_back_ios__ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_large___7);

		
		_bg__android_large___7_ek2 = (View) findViewById(R.id._bg__android_large___7_ek2);
		__img___icon__battery_ = (ImageView) findViewById(R.id.__img___icon__battery_);
		__img___icon__wifi__ek1 = (ImageView) findViewById(R.id.__img___icon__wifi__ek1);
		__img___icon__network__ek1 = (ImageView) findViewById(R.id.__img___icon__network__ek1);
		__img___icon__speaker__ek1 = (ImageView) findViewById(R.id.__img___icon__speaker__ek1);
		txt_12_30_ek2 = (TextView) findViewById(R.id.txt_12_30_ek2);
		__img___illustration__crypto__ek1 = (ImageView) findViewById(R.id.__img___illustration__crypto__ek1);
		pashibei_ek1 = (TextView) findViewById(R.id.pashibei_ek1);
		investing_ = (TextView) findViewById(R.id.investing_);
		rectangle_31_ek1 = (View) findViewById(R.id.rectangle_31_ek1);
		rectangle_32_ek1 = (View) findViewById(R.id.rectangle_32_ek1);
		id_number = (TextView) findViewById(R.id.id_number);
		pash_account = (TextView) findViewById(R.id.pash_account);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);
		rectangle_34 = (View) findViewById(R.id.rectangle_34);
		update = (TextView) findViewById(R.id.update);
		cancel = (TextView) findViewById(R.id.cancel);
		don_t_have_a = (TextView) findViewById(R.id.don_t_have_a);
		get_one_here = (TextView) findViewById(R.id.get_one_here);
		___img___icon__arrow_back_ios__ek1 = (ImageView) findViewById(R.id.___img___icon__arrow_back_ios__ek1);
	
		
		___img___icon__arrow_back_ios__ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), android_large___6_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	