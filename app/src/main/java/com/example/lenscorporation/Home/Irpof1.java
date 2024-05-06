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
 * Use the {@link Irpof1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Irpof1 extends Fragment {
    TextView irpf1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Irpof1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Irpof1.
     */
    // TODO: Rename and change types and number of parameters
    public static Irpof1 newInstance(String param1, String param2) {
        Irpof1 fragment = new Irpof1();
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
        View view= inflater.inflate(R.layout.fragment_irpof1, container, false);




        String str1="Indian Railway Promotee Officers Federation (IRPOF)\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers" +
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways."+
                "The Aim Of The Federation Is To Safeguard Interests Of Promotee Officers And Provide Better Career"+
                "Opportunities And Working Conditions. It Works For Development And Promoting Overall Efficiency In"+
                "The Working Of Railways In The Best Interest Of Common People, The Nation And The Railway Men.\n"+
                "\n"+
                "IRPOF Has Launched This Site To Keep Its Member Informed About The, Latest Activities And Share"+
                "Views On Topics Of Importance. All The Members Are Requested To Kindly Contribute To Make The"+
                "Site Useful And Meaningful.";

        irpf1=view.findViewById(R.id.irpf1);
        irpf1.setText(str1);
        irpf1.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
}