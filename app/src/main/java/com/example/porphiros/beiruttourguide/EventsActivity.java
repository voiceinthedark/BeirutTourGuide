package com.example.porphiros.beiruttourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location.Builder("Cedar\'s Festival").phoneNb("70-445665").build());
        locations.add(new Location.Builder("Cedar\'s Festival").phoneNb("71-356484").build());
        locations.add(new Location.Builder("Cedar\'s Festival").phoneNb("03-151578").build());
        locations.add(new Location.Builder("Cedar\'s Festival").phoneNb("03-665454").build());

        LocationAdapter locationAdapter = new LocationAdapter(this,
                R.layout.list_item_activity, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

    }
}
