package com.example.porphiros.beiruttourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Setup {@link ViewPager} on {@link MainActivity}
         */
        ViewPager viewPager = findViewById(R.id.category_viewpager);

        /**
         * attach the custom {@link android.support.v4.app.FragmentStatePagerAdapter}, {@link CategoryPagerAdapter}
         * to the view pager.
         */
        viewPager.setAdapter(new CategoryPagerAdapter(getApplicationContext(),
                getSupportFragmentManager()));


        TabLayout tabLayout = (TabLayout) findViewById(R.id.categorytabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
