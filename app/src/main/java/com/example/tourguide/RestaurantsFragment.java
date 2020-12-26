package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(getResources().getString(R.string.att_2_11), R.drawable.kyshlak, getResources().getString(R.string.att_2_12),getResources().getString(R.string.att_2_13)));
        restaurants.add(new Place(getResources().getString(R.string.att_2_21), R.drawable.alasha, getResources().getString(R.string.att_2_22),getResources().getString(R.string.att_2_23)));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restaurants);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(placeAdapter);

        return rootView;


    }
}
