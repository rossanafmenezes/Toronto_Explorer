package com.example.torontoexplorer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.landmark_name_1), getString(R.string.landkark_info_1), R.drawable.cntower));
        locations.add(new Location(getString(R.string.landmark_name_2), getString(R.string.landkark_info_2), R.drawable.casaloma));
        locations.add(new Location(getString(R.string.landmark_name_3), getString(R.string.landkark_info_3), R.drawable.rom));
        locations.add(new Location(getString(R.string.landmark_name_4), getString(R.string.landkark_info_4), R.drawable.highpark));
        locations.add(new Location(getString(R.string.landmark_name_5), getString(R.string.landkark_info_5), R.drawable.polarbear));
        locations.add(new Location(getString(R.string.landmark_name_6), getString(R.string.landkark_info_6), R.drawable.ripleys ));
        locations.add(new Location(getString(R.string.landmark_name_7), getString(R.string.landkark_info_7), R.drawable.ago));
        locations.add(new Location(getString(R.string.landmark_name_8), getString(R.string.landkark_info_8), R.drawable.torontoisland ));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_landmarks);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}