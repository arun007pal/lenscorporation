package com.example.lenscorporation.event;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenscorporation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BoardMeeting#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BoardMeeting extends Fragment {

    ImageView img1,img2,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BoardMeeting() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BoardMeeting.
     */
    // TODO: Rename and change types and number of parameters
    public static BoardMeeting newInstance(String param1, String param2) {
        BoardMeeting fragment = new BoardMeeting();
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
        View view= inflater.inflate(R.layout.fragment_board_meeting, container, false);

        TextView board_meeting_tv=view.findViewById(R.id.board_meeting_tv);
        TextView board_meeting_tv2=view.findViewById(R.id.board_meeting_tv2);
        TextView board_meeting_tv3=view.findViewById(R.id.board_meeting_tv3);

        img1=view.findViewById(R.id.img1);
        img2=view.findViewById(R.id.img2);
        img4=view.findViewById(R.id.img4);
        img5=view.findViewById(R.id.img5);
        img6=view.findViewById(R.id.img6);
        img7=view.findViewById(R.id.img7);
        img8=view.findViewById(R.id.img8);
        img9=view.findViewById(R.id.img9);

        img10=view.findViewById(R.id.img10);
        img11=view.findViewById(R.id.img11);
        img12=view.findViewById(R.id.img12);
        img13=view.findViewById(R.id.img13);



        String str4="Board Meeting\n" +
                "\n" +
                "Indian Railways Promotee Officers Federation (IRPOF)\n" +
                "\n" +
                "Published on: 10/02/2024\n" +
                "\n" +
                "Indian Railways Promotee Officers Federation (IRPOF) is an organisation of Promotee officers having its Head Quarter at New Delhi.\n" +
                "\n" +
                "IRPOF has launched this site to keep its member informed about the, latest activities and share views on topics of importance. All the members are requested to kindly contribute to make the site useful and meaningful.";

        board_meeting_tv.setText(str4);
        board_meeting_tv2.setText(str4);
        board_meeting_tv3.setText(str4);

        return view;
    }
}