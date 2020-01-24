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

public class ShopsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.mall_of_berlin), R.drawable.berlin_mall));
        places.add(new Place(getString(R.string.ampel_mann), R.drawable.ampel_mann));
        places.add(new Place(getString(R.string.berliner_zinfiguren), R.drawable.berliner_zinfiguren));
        places.add(new Place(getString(R.string.sing_blackbird), R.drawable.sing_blackbird));
        places.add(new Place(getString(R.string.bikini_berlin), R.drawable.bikini_berlin));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
