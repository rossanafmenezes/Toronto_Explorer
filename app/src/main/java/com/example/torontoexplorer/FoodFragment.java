package com.example.torontoexplorer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.food_name_1), getString(R.string.food_info_1), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_2), getString(R.string.food_info_2), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_3), getString(R.string.food_info_3), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_4), getString(R.string.food_info_4), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_5), getString(R.string.food_info_5), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_6), getString(R.string.food_info_6), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_7), getString(R.string.food_info_7), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_8), getString(R.string.food_info_8), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_9), getString(R.string.food_info_9), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_10), getString(R.string.food_info_10), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_11), getString(R.string.food_info_11), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_12), getString(R.string.food_info_12), R.drawable.baseline_restaurant_black_18));
        locations.add(new Location(getString(R.string.food_name_13), getString(R.string.food_info_13), R.drawable.baseline_restaurant_black_18));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
