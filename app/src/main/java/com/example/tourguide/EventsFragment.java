package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Place> events = new ArrayList<>();
        events.add(new Place(getResources().getString(R.string.att_4_11), R.drawable.nauryz, getResources().getString(R.string.att_4_12),getResources().getString(R.string.att_4_13)));
        events.add(new Place(getResources().getString(R.string.att_4_21), R.drawable.almaty_day, getResources().getString(R.string.att_4_22),getResources().getString(R.string.att_4_23)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), events);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }


}

