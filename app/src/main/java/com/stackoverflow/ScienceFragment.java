package com.stackoverflow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Techno Blogger on 15/1/17.
 */

public class ScienceFragment extends Fragment {
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static ScienceFragment newInstance(int page, String title) {
        ScienceFragment fragmentFirst = new ScienceFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_science, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.textScience);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
