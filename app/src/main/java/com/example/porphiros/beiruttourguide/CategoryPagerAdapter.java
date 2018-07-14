package com.example.porphiros.beiruttourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public CategoryPagerAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new RestaurantFragment();
            case 1:
                return new PublicPlacesFragment();
            case 2:
                return new EventsFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        //Three categories: Restaurants, public places and events
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.restaurants);
            case 1:
                return mContext.getString(R.string.public_places);
            case 2:
                return mContext.getString(R.string.events);
                default:
                    return null;

        }
    }
}
