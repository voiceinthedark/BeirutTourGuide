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

        //Log.d(TAG, "inside restaurant activity");

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location.Builder("Barbar").phoneNb("70-445665").build());
        locations.add(new Location.Builder("Barbar").phoneNb("71-356484").build());
        locations.add(new Location.Builder("Barbar").phoneNb("03-151578").build());
        locations.add(new Location.Builder("Barbar").phoneNb("03-665454").build());

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
