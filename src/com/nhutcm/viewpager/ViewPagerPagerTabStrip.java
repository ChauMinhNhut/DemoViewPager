package com.nhutcm.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

import com.jsoncorp.demoviewpager.R;
import com.nhutcm.adapter.PagerAdapter;

/**
 * Trong 1 so truong hop, ban khong duoc dung ActionBar trong ung dung thi ban
 * co the ap dung cach duoi day de tao ra 1 ung dung tuong tu -ViewPager + Tab
 * Navigation
 * 
 * ViewPager + PagerTabStrip {@link #mViewPager + #mTabStrip}
 * 
 * @author Chau Minh Nhut
 * @date 13/12/2013
 * @version 1.0
 * 
 */
public class ViewPagerPagerTabStrip extends FragmentActivity {

	private PagerAdapter mPagerAdapter;
	private ViewPager mViewPager;
	private PagerTabStrip mTabStrip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_viewpager_pagertabstrip);

		// KHOI TAO DOI TUONG
		mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), this);

		// LOAD VAO VIEWPAGER
		mViewPager = (ViewPager) findViewById(R.id.pagerTabStrip);
		mViewPager.setAdapter(mPagerAdapter);

		mTabStrip = (PagerTabStrip) findViewById(R.id.tabStrip);
		mTabStrip.setDrawFullUnderline(false);

	}

}
