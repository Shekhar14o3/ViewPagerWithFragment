package com.stackoverflow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=(ViewPager)findViewById(R.id.vpPager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return ScienceFragment.newInstance(0, "Science");
                case 1: return SimpleFragment.newInstance(1, "Simple");
                default: return ScienceFragment.newInstance(0, "Default");
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}