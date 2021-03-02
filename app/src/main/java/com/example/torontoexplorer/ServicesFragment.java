package com.example.torontoexplorer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ServicesFragment extends Fragment {

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.services_name_1), getString(R.string.services_info_1), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_2), getString(R.string.services_info_2), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_3), getString(R.string.services_info_3), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_4), getString(R.string.services_info_4), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_5), getString(R.string.services_info_5), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_6), getString(R.string.services_info_6), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location(getString(R.string.services_name_7), getString(R.string.services_info_7), R.drawable.baseline_help_outline_black_18));
        locations.add(new Location (getString(R.string.services_name_8), getString(R.string.services_info_8), R.drawable.baseline_help_outline_black_18));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_services);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}