package com.example.porphiros.beiruttourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class RestaurantActivity extends AppCompatActivity {

    public static final String TAG = ".restaurantActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment())
                .commit();
    }
}
