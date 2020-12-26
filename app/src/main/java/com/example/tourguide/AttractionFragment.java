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

public class AttractionFragment extends Fragment {

    public AttractionFragment() {
    }

    //added annotation NoNull and Nullable
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //creating an array list
        ArrayList<Place> attractions = new ArrayList<>();
        attractions.add(new Place(getResources().getString(R.string.att_11), R.drawable.cathedral, getResources().getString(R.string.att_12),getResources().getString(R.string.att_13)));
        attractions.add(new Place(getResources().getString(R.string.att_21), R.drawable.monument, getResources().getString(R.string.att_22),getResources().getString(R.string.att_23)));
        attractions.add(new Place(getResources().getString(R.string.att_31), R.drawable.kok_tyube, getResources().getString(R.string.att_32),getResources().getString(R.string.att_33)));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(placeAdapter);

        return rootView;


    }


}
