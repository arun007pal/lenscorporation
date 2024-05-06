package com.example.lenscorporation;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lenscorporation.R;

public class Organization extends Fragment {
    RecyclerView recyclerview2;
    ScrollView scrollview;
 TextView textview11;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.organization,container,false);
        //scrollview=view.findViewById(R.id.scrollview);




        //textview11=view.findViewById(R.id.textview11);
        //textview11.setText(para);

        // to perform the movement action
        // Moves the cursor or scrolls to the
        // top or bottom of the document
       // textview11.setMovementMethod(new ScrollingMovementMethod());

        return view;

    }
}
