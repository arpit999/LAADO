package com.example.laado.tabbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.laado.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragmentTwo extends Fragment {

    View rootview;

    public TabFragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.tab_fragment_history,container,false);




        return rootview;
    }



}
