package com.example.BasiceTheQuran.ui.main.ui.main.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.BasiceTheQuran.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,R.string.tab_text_9,R.string.tab_text_10,R.string.tab_text_11,R.string.tab_text_12,R.string.tab_text_13,R.string.tab_text_14};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return Chapter3n1.newInstance(position + 1);
            case 1:
                return Chapter3n2.newInstance(position + 1);
            case 2:
                return Chapter3n3.newInstance(position + 1);
            case 3:
                return Chapter3n4.newInstance(position + 1);
            case 4:
                return Chapter3n5.newInstance(position + 1);
            case 5:
                return Chapter3n6.newInstance(position + 1);
            case 6:
                return Chapter3n7.newInstance(position + 1);
            case 7:
                return Chapter3n8.newInstance(position + 1);
            case 8:
                return Chapter3n9.newInstance(position + 1);
            case 9:
                return Chapter3n10.newInstance(position + 1);
            case 10:
                return Chapter3n11.newInstance(position + 1);

            case 11:
                return Chapter3n12.newInstance(position + 1);
            case 12:
                return Chapter3n13.newInstance(position + 1);
            case 13:
                return Chapter3n14.newInstance(position + 1);

        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 14;
    }
}