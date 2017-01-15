package com.stackoverflow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Techno Blogger on 15/1/17.
 */

public class SimpleFragment extends Fragment {

    // newInstance constructor for creating fragment with arguments
    public static SimpleFragment newInstance(int page, String title) {
        SimpleFragment fragmentFirst = new SimpleFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_simple, null);
        return rootView;
    }
}
