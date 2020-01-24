package com.example.tourberlin.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourberlin.Fragments.FoodFragment;
import com.example.tourberlin.Fragments.InfoFragment;
//import com.example.tourberlin.Fragments.PlaceFragment;
import com.example.tourberlin.Fragments.ShopsFragment;
import com.example.tourberlin.Fragments.SightsFragment;
import com.example.tourberlin.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class PlacesPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_sights, R.string.tab_text_food, R.string.tab_text_shops,R.string.tab_text_info};
    private final Context mContext;

    public PlacesPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
Fragment fragment = null;
switch(position) {
    case 0:
        fragment = new SightsFragment();
        break;
    case 1:
        fragment = new FoodFragment();
        break;
    case 2:
        fragment = new ShopsFragment();
        break;
    case 3:
        fragment = new InfoFragment();
}
return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}