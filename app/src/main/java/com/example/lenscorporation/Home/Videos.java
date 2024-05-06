package com.example.lenscorporation.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenscorporation.R;


public class Videos extends Fragment {

    ImageView img1,img2,img8,img9;
    TextView img_tv;

    public Videos() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_videos, container, false);
        img1=view.findViewById(R.id.img1);
        img2=view.findViewById(R.id.img2);
        img8=view.findViewById(R.id.img8);
        img9=view.findViewById(R.id.img9);

        String vidos="Videos\n" +
                "\n" +
                "Following Are The Images From The Recent Event Held On Friday, 19th January Regarding ECM/AGM.";

        img_tv=view.findViewById(R.id.img_tv);
        img_tv.setText(vidos);
        return view;
    }
}