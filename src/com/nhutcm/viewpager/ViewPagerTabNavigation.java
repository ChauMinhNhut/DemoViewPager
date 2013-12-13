package com.nhutcm.viewpager;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

import com.jsoncorp.demoviewpager.R;
import com.nhutcm.adapter.PagerAdapter;

/**
 * ViewPager + Tab Navigation {@link #mViewPager + #mActionBar}
 * 
 * @author Chau Minh Nhut
 * @date 13/12/2013
 * @version 1.0
 *
 */
public class ViewPagerTabNavigation extends FragmentActivity implements TabListener {

	private PagerAdapter mPagerAdapter;
	private ViewPager mViewPager;
	private ActionBar mActionBar;

	public static List<String> pageTitle = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_viewpager_tab_navigation);

		// THEM DANH SACH CAC TIEU DE
		addTitle();

		// KHOI TAO DOI TUONG
		mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), this);

		// LOAD VAO VIEWPAGER
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mPagerAdapter);

		// HIEN THI ACTION BAR
		mActionBar = getActionBar();
		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// AN DI ACTIONBAR BAN DAU
		mActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

		// THEM CAC TAB TREN ACTIONBAR
		for (int i = 0; i < mPagerAdapter.getCount(); i++) {

			mActionBar.addTab(mActionBar.newTab()
					.setText(pageTitle.get(i).toString()).setTabListener(this));

			/**
			 * Thay vi add title, ban co the add 1 customview len tren tab
			 * Navigation
			 */

			/*
			 * LayoutInflater inflate = LayoutInflater.from(MainActivity.this);
			 * View v = inflate.inflate(R.layout.layout_button, null, false);
			 * TextView tv = (TextView) v.findViewById(R.id.tvTitle);
			 * tv.setText("TAB " + i);
			 * 
			 * Tab t = mActionBar.newTab(); t.setTabListener(this);
			 * 
			 * t.setCustomView(v);
			 * 
			 * mActionBar.addTab(t);
			 */

		}

		// LANG NGHE SU KIEN KEO QUA LAI CUA VIEWPAGER
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				mActionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void addTitle() {
		pageTitle.add("Tab 1");
		pageTitle.add("Tab 2");
		pageTitle.add("Tab 3");
		pageTitle.add("Tab 4");

	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

}
