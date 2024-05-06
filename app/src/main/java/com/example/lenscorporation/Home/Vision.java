package com.example.lenscorporation.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenscorporation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Vision#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Vision extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Vision() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Vision.
     */
    // TODO: Rename and change types and number of parameters
    public static Vision newInstance(String param1, String param2) {
        Vision fragment = new Vision();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_vision, container, false);
        String str2="Our Mission\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers"+
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways."+
                "\n\n"+
                "Our Vision\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers"+
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways.";
     TextView vision_tv =view.findViewById(R.id.vision_tv);
        vision_tv.setText(str2);
        vision_tv.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
}