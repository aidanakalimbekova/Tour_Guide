package com.example.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        //there is a depreciation of a class, have a question on that
        //but works fine
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {

        if(position==0){
            return new AttractionFragment();
        }else if(position==1){
            return new RestaurantsFragment();
        }else if(position==2){
            return new NatureFragment();
        }else if(position==3){
            return new EventsFragment();
        }else {
            return null;
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0) {
            return mContext.getString(R.string.attractions_name);
        }else if(position==1){
            return mContext.getString(R.string.restaurants_name);
        }else if(position==2) {
            return mContext.getString(R.string.nature_name);
        }else if(position==3) {
            return mContext.getString(R.string.events_name);
        }else {
            return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }//size of the pages

}
