package com.example.lenscorporation;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Mission extends Fragment {



    public Mission() {
        // Required empty public constructor
    }




@Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mission, container, false);
        TextView mission_tv=view.findViewById(R.id.mission_tv);
        return view;
    }
}