package com.nhutcm.viewpager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jsoncorp.demoviewpager.R;

/**
 * Huong dan cach su dung viewpager trong cac truong hop khac nhau
 * 
 * @author Chau Minh Nhut
 * @since 13/12/2013
 * @version 1.0
 *
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void loadViewPagerWithTabNavigation(View v) {
		startActivity(new Intent(this, ViewPagerTabNavigation.class));
	}

	public void loadViewPagerWithPagerTabStrip(View v) {
		startActivity(new Intent(this, ViewPagerPagerTabStrip.class));
	}

	public void loadViewPagerWithPagerSlidingTabStrip(View v) {
		startActivity(new Intent(this,ViewPagerPagerSlidingTabStrip.class));
	}
}
