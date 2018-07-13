package com.example.porphiros.beiruttourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    private static final String EXTRA_LOCATION = "porphiros.location";
    private Location mLocation;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_detail_activity);

        mLocation = (Location) getIntent().getExtras().getSerializable(EXTRA_LOCATION);

        //TODO: add ImageView

        TextView nameTextView = findViewById(R.id.name_item);
        TextView addressTextView = findViewById(R.id.address_item);
        TextView phoneTextView = findViewById(R.id.phone_item);
        TextView descriptionTextView = findViewById(R.id.description_item);

        nameTextView.setText(mLocation.getName());
        addressTextView.setText(mLocation.getAddress());
        phoneTextView.setText(mLocation.getPhone());
        descriptionTextView.setText(mLocation.getDescription());

        ImageView img = findViewById(R.id.image_item);
        img.setImageResource(mLocation.getImageResource());



    }

    public static Intent newIntent(Context context, Location location){
        Intent intent = new Intent(context, ItemDetailActivity.class);
        intent.putExtra(EXTRA_LOCATION, location);

        return intent;
    }
}
