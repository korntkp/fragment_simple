package com.example.korshreddern.a16fragmentsimple.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Korshreddern on 30-Dec-16.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "MyPagerAdapter";
    private final int PAGER_NUMBER = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Log.d(TAG, "getItem Position: 0");
            return PagerFirstFragment.newInstance("Hello  First");
        } else if (position == 1) {
            Log.d(TAG, "getItem Position: 1");
            return PagerSecondFragment.newInstance("Hello Second");
        } else if (position == 2) {
            Log.d(TAG, "getItem Position: 2");
            return PagerThirdFragment.newInstance("Hello Third");
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGER_NUMBER;
    }
}
