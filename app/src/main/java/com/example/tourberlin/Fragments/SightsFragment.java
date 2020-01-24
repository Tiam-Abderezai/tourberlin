package com.example.tourberlin.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tourberlin.Place;
import com.example.tourberlin.PlaceAdapter;
import com.example.tourberlin.R;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.brandenburger_gate), R.drawable.brandenburger_gate));
        places.add(new Place(getString(R.string.technik_museum), R.drawable.technik_museum));
        places.add(new Place(getString(R.string.fernsehturm), R.drawable.fernsehturm_berlin));
        places.add(new Place(getString(R.string.alexanderplatz_berlin), R.drawable.alexanderplatz_berlin));
        places.add(new Place(getString(R.string.reichstag_berlin), R.drawable.reichstag_berlin));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
