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

public class NatureFragment extends Fragment {

    public NatureFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Place> nature = new ArrayList<>();
        nature.add(new Place(getResources().getString(R.string.att_3_11), R.drawable.medeo, getResources().getString(R.string.att_3_12),getResources().getString(R.string.att_3_13)));
        nature.add(new Place(getResources().getString(R.string.att_3_21), R.drawable.big_almaty_lake, getResources().getString(R.string.att_3_22),getResources().getString(R.string.att_3_23)));
        nature.add(new Place(getResources().getString(R.string.att_3_31), R.drawable.kolsay, getResources().getString(R.string.att_3_32),getResources().getString(R.string.att_3_33)));
        nature.add(new Place(getResources().getString(R.string.att_3_41), R.drawable.shymbulak_ski, getResources().getString(R.string.att_3_42),getResources().getString(R.string.att_3_43)));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), nature);

        ListView listView = rootView.findViewById(R.id.place_list);

        listView.setAdapter(placeAdapter);

        return rootView;


    }


}
