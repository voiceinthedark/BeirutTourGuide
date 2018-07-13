package com.example.porphiros.beiruttourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    public static final String TAG = ".restaurantActivity";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location.Builder("Barbar")
                .address("Hamra - PIccadilly Street، Beirut")
                .phoneNb("01 753 330")
                .description("One of the oldest restaurants of Beirut. Open 24 hours")
                .image(R.drawable.barbar)
                .build());
        locations.add(new Location.Builder("Bliss House")
                .phoneNb("01 366 290")
                .address("Hamra - Bliss street")
                .description("A landmark of Bliss St., Hamra, open 24 hours.")
                .image(R.drawable.bliss_house)
                .build());
        locations.add(new Location.Builder("Kababji")
                .phoneNb("01 74 15 55")
                .address("Hamra st.")
                .description("Lebanese Grills")
                .image(R.drawable.kababji)
                .build());
        locations.add(new Location.Builder("T-marbouta")
                .phoneNb("01 350 274")
                .address("Hamra main St.")
                .image(R.drawable.t_marbouta)
                .build());
        locations.add(new Location.Builder("Malak el Tawouk")
                .image(R.drawable.malak_tawouk)
                .phoneNb("1592")
                .address("Hamra main St., Beirut")
                .description("Fast food")
                .build());

        LocationAdapter locationAdapter = new LocationAdapter(this,
                R.layout.list_item_activity, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        /**
         * Item click listener to open a detail view of the item
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /**
                 * setup intent to move to the detail view activity
                 */
                Intent intent = ItemDetailActivity
                        .newIntent(RestaurantActivity.this,
                                locations.get(position));
                startActivity(intent);
            }
        });



    }
}
