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
public class PublicPlacesFragment extends Fragment {


    public PublicPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_activity, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location.Builder("Martyr Square")
                .image(R.drawable.martyr_square)
                .phoneNb("70-445665").build());
        locations.add(new Location.Builder("Sanayeh Garden")
                .image(R.drawable.sanayeh)
                .phoneNb("71-356484").build());
        locations.add(new Location.Builder("Zeytouna bay")
                .image(R.drawable.zeytouna)
                .phoneNb("03-151578").build());
        locations.add(new Location.Builder("Horsh beirut")
                .image(R.drawable.horsch)
                .phoneNb("03-665454").build());
        locations.add(new Location.Builder("Capuchins Garden")
                .image(R.drawable.capuchins_garden)
                .phoneNb("03-665454").build());

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
