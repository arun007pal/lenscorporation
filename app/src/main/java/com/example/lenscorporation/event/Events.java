package com.example.lenscorporation.event;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lenscorporation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Events#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Events extends Fragment { Button bd_meeting,ecm,agm,emrgnt_meeting;
    FragmentContainerView fragment_container_event_view_tag;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Events() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Events.
     */
    // TODO: Rename and change types and number of parameters
    public static Events newInstance(String param1, String param2) {
        Events fragment = new Events();
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
        return inflater.inflate(R.layout.fragment_events, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        fragment_container_event_view_tag=view.findViewById(R.id.fragment_container_event_view_tag);

        bd_meeting=view.findViewById(R.id.bd_meeting);
        loadFragment(new BoardMeeting());
        bd_meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new BoardMeeting());
            }
        });
        ecm=view.findViewById(R.id.ecm);
        ecm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ECM());


            }
        });
        agm=view.findViewById(R.id.agm);
        agm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AGM());
            }
        });
        emrgnt_meeting=view.findViewById(R.id.emrgnt_meeting);
        emrgnt_meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new EmergentMeeting());
            }
        });




    }
    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        //   FragmentManager fm = getFragmentManager();
        FragmentManager fm=getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fragment_container_event_view_tag, fragment);
        fragmentTransaction.commit(); // save the changes
    }
    }
