package com.example.horton.toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.List;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mTitles;

    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
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
