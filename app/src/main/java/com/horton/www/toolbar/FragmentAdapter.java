package com.horton.www.toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by Horton on 2015/9/15.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {
    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    private List<Fragment> mFragments;
    private List<String> mTitles;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        if (L) Log.i(CLASSNAME, "FragmentAdapter");

        mFragments = fragments;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (L) Log.i(CLASSNAME, "getItem: " + position);
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        if (L) Log.i(CLASSNAME, "mFragments.size(): " + mFragments.size());
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
