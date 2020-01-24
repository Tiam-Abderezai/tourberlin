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

public class InfoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.berlin_hospital), R.drawable.martin_luther_hospital));
        places.add(new Place(getString(R.string.us_consulate), R.drawable.us_consulate));
        places.add(new Place(getString(R.string.police_station), R.drawable.police_station));
        places.add(new Place(getString(R.string.tiergarten_park), R.drawable.tiergarten_park));
        places.add(new Place(getString(R.string.tegel_airport), R.drawable.tegel_airport));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
