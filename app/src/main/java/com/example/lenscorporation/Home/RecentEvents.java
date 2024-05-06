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
 * Use the {@link RecentEvents#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecentEvents extends Fragment {

    TextView recent_event_tv;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecentEvents() {
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
    public static RecentEvents newInstance(String param1, String param2) {
        RecentEvents fragment = new RecentEvents();
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
        View view= inflater.inflate(R.layout.recent_event, container, false);

        String str3="Recent Events\n"+
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi.\n"+
                "\n"+
                "Published On: 10/02/2024"+
                "\n\n\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi."+
                "\n\n"+
                "Published On: 10/02/2024\n" +
                "\n"+
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi."+
                "\n\n"+
                "Published On: 10/02/2024";
        recent_event_tv=view.findViewById(R.id.recent_event_tv);
        recent_event_tv.setText(str3);
        recent_event_tv.setMovementMethod(new ScrollingMovementMethod());

        return view;
    }
}