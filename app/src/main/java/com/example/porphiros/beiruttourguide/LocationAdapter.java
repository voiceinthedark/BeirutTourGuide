package com.example.porphiros.beiruttourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class LocationAdapter extends ArrayAdapter<Location> {

    private List<Location> mLocations;

    public LocationAdapter(@NonNull Context context, int resource, List<Location> locations) {
        super(context, resource, locations);
        mLocations = locations;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_activity, parent, false);
        }

        Location location = mLocations.get(position);

        TextView nameTextView = view.findViewById(R.id.list_name);
        TextView phoneTextView = view.findViewById(R.id.list_phone);

        nameTextView.setText(location.getName());
        phoneTextView.setText(location.getPhone());

        CircleImageView avatar = view.findViewById(R.id.avatar);
        avatar.setImageResource(mLocations.get(position).getImageResource());



        return view;
    }
}
