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

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.curry_wurst), R.drawable.curry_wurst));
        places.add(new Place(getString(R.string.kotti_doener), R.drawable.kotti_doener));
        places.add(new Place(getString(R.string.zur_letzten_instanz), R.drawable.zur_letzten_instanz));
        places.add(new Place(getString(R.string.imren_grill), R.drawable.imren_grill));
        places.add(new Place(getString(R.string.the_bird_berlin), R.drawable.the_bird_berlin));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}