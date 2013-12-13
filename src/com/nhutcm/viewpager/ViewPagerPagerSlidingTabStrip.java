package com.nhutcm.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.jsoncorp.demoviewpager.R;
import com.nhutcm.adapter.PagerAdapter;
import com.nhutcm.library.PagerSlidingTabStrip;

/**
 * 
 * ViewPager + PagerSlidingTabStrip {@link #mViewPager + #mTabs}
 * 
 * @author Chau Minh Nhut
 * @date 13/12/2013
 * @version 1.0
 * 
 */
public class ViewPagerPagerSlidingTabStrip extends FragmentActivity {

	private PagerAdapter mPagerAdapter;
	private ViewPager mViewPager;
	private PagerSlidingTabStrip mTabs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_viewpager_pagersliding_tab_strip);

		// KHOI TAO DOI TUONG
		mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), this);

		// LOAD VAO VIEWPAGER
		mViewPager = (ViewPager) findViewById(R.id.pagerSlidingTabStrip);
		mViewPager.setAdapter(mPagerAdapter);

		mTabs = (PagerSlidingTabStrip) findViewById(R.id.tabsSliding);
		mTabs.setViewPager(mViewPager);

	}

}
