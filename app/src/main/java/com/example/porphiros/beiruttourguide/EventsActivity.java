package com.example.porphiros.beiruttourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location.Builder("Boat Parties, Lets Break the Routine!")
                .address("Dbayeh, Mont Liban, Lebanon ")
                .description("Break the routine and join us every weekend for a special" +
                        " trip on board the Sea Wolf. The boat fits for up to 80 persons standing " +
                        "on deck and has 6 bedrooms with private bathrooms each, a large living " +
                        "area," +
                        " a bar, a fully equipped kitchenette and a large deck where you can enjoy " +
                        "your night gazing at the stars.\n" +
                        "\n" +
                        "Read more on http://www.lebtivity.com/event/boat-parties-lets-break-the-routine-1")
                .image(R.drawable.boat_party)
                .phoneNb("71-941100 ").build());
        locations.add(new Location.Builder("The Youngpreneur Program Camp")
                .address("Beirut, Lebanon")
                .description("You have a business idea or you are searching for one?" +
                        " The YoungPreneur program is a three weeks bootcamp dedicated to kids " +
                        "from 7 to 17 that aim to provide you with all necessary tools to do so " +
                        "from brain storming to coding even to managing your own social media. " +
                        "The Boot Camp will strengthen your systems thinking, infuse you with a " +
                        "collaborative identify and focus your mindset on the long-term.\n" +
                        "\n" +
                        "Price:300$ \n" +
                        "Read more on http://www.lebtivity.com/event/the-youngpreneur-program")
                .image(R.drawable.youngpreneur)
                .phoneNb("71-356484").build());
        locations.add(new Location.Builder("Beirut Fan Festival")
                .address("Beirut Waterfront Area, Beirut, Lebanon")
                .description("Beirut Fan Festival 2018\n" +
                        "\n" +
                        "The Ultimate World Cup Experience Join the action on the largest screen in Lebanon! ")
                .image(R.drawable.fan_festival)
                .phoneNb("81 252 252").build());
        locations.add(new Location.Builder("Water Sports in Lebanon")
                .description("Water Sports in Lebanon\n" +
                        "\n" +
                        "With 225km of Mediterranean coastline, as well as numerous rivers throughout the country, Lebanon offers many salt- and fresh-water sporting activities. Lebanon’s rocky coastline and underwater terrain make it a unique destination for snorkeling and diving. A 600m deep underwater valley runs from Beirut to the Bay of Jounié, creating interesting rocky gorges and underwater cliffs and dropoffs for divers to explore. Another popular diving area is at Chikka (near Tripoli), which offers some of the best marine landscapes and flora and fauna off the Lebanese coast.\n" +
                        "\n" +
                        "Activity Duration\n" +
                        "PARASAILING 10 MIN\n" +
                        "BULLET 10 MIN\n" +
                        "JET PACK 35 MIN\n" +
                        "JET SKI 15 MIN\n" +
                        "\n" +
                        "\n" +
                        "JET ADVENTURE (MIN 12 PAX)\n" +
                        "JET BOAT (MIN 6 PAX)\n" +
                        "JET BOAT (MIN 6 PAX)\n" +
                        "BANNAN RIDE (MIN 5 PAX)\n" +
                        "FAT CAT (MIN 5 PAX)\n" +
                        "BIG MABLE (MIN 2 PAX)\n" +
                        "RELAX 4 (MIN 4 PAX)\n" +
                        "WAKE WORRIER (MIN 3 PAX)\n" +
                        "SKI NAUTIQUE\n" +
                        "\n" +
                        "\n" +
                        "(Parasailing + Big Mable) for two people USD 140\n" +
                        "(Parasailing) for two people USD 100\n" +
                        "(Parasailing) for Three people USD 150\n" +
                        "( Banana Boat + Fat Cat) for two people USD 120 \n" +
                        "Read more on http://www.lebtivity.com/event/water-sports-in-lebanon")
                .image(R.drawable.water_sport)
                .phoneNb("71-941100").build());

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
                        .newIntent(EventsActivity.this,
                                locations.get(position));
                startActivity(intent);
            }
        });

    }
}
