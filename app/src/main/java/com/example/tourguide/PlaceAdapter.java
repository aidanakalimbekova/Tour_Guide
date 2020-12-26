package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeNameTextView = (TextView) listView.findViewById(R.id.place_name);
        placeNameTextView.setText(currentPlace.getPlaceName());

        ImageView imageView = (ImageView) listView.findViewById(R.id.place_image);
        imageView.setImageResource(currentPlace.getPlaceImage());

        TextView placeAddressTextView = (TextView) listView.findViewById(R.id.place_address);
        placeAddressTextView.setText(currentPlace.getPlaceAddress());

        TextView placeDescTextView = (TextView) listView.findViewById(R.id.place_description);
        placeDescTextView.setText(currentPlace.getPlaceDescription());



        return listView;
    }
}
