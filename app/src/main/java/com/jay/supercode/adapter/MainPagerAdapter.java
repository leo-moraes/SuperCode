package com.jay.supercode.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import java.util.ArrayList;

import com.jay.supercode.fragment.GenerateFragment;
import com.jay.supercode.fragment.HistoryFragment;
import com.jay.supercode.fragment.ScanFragment;

/**
 * Created by Ashiq on 18/4/17.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<String> mFragmentItems;

    public MainPagerAdapter(FragmentManager fm, ArrayList<String> fragmentItems) {
        super(fm);
        this.mFragmentItems = fragmentItems;
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;

        if(i == 0) {
            fragment = new ScanFragment();
        } else if(i == 1){
            fragment = new GenerateFragment();
        } else if(i == 2){
            fragment = new HistoryFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return mFragmentItems.size();
    }

}
