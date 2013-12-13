package com.nhutcm.adapter;

import fragment.Fragment_baohiemxemay;
import fragment.Fragment_cmnd;
import fragment.Fragment_giaydkmotoxemay;
import fragment.Fragment_giaypheplaixe;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter cua viewpager
 * 
 * @author Chau Minh Nhut
 * @version 1.0
 * @since 13/10/2013
 *
 */
public class PagerAdapter extends FragmentPagerAdapter {

	private static int TAB_COUNT = 4;
	Context mContext;

	public PagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		mContext = context;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return "Tab 1";
		case 1:
			return "Tab 2";
		case 2:
			return "Tab 3";
		case 3:
			return "Tab 4";

		default:
			break;
		}
		return super.getPageTitle(position);
	}

	@Override
	public Fragment getItem(int tabPosition) {
		// TODO Auto-generated method stub
		Fragment f;
		switch (tabPosition) {
		case 0:
			f = new Fragment_cmnd();
			break;
		case 1:
			f = new Fragment_giaypheplaixe();
			break;
		case 2:
			f = new Fragment_giaydkmotoxemay();
			break;
		case 3:
			f = new Fragment_baohiemxemay();
			break;
		default:
			return null;
		}

		return f;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TAB_COUNT;
	}

	
}
