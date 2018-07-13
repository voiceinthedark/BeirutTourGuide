package com.example.porphiros.beiruttourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_activity, container, false);

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

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),
                R.layout.list_item_activity, locations);

        ListView listView = (ListView) view.findViewById(R.id.list);

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
                        .newIntent(getActivity(),
                                locations.get(position));
                startActivity(intent);
            }
        });


        return view;
    }

}
