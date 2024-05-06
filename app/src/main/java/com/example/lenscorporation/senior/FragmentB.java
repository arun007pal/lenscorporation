package com.example.lenscorporation.senior;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenscorporation.FileDownloader;
import com.example.lenscorporation.R;
import com.example.lenscorporation.WebView.WebViewPDFPreview;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentB extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentB() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentB.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentB newInstance(String param1, String param2) {
        FragmentB fragment = new FragmentB();
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
        View view= inflater.inflate(R.layout.fragment_b, container, false);

        String pdf = "https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874259/rpaon7hr73ranyfhojne.pdf";
        String pdf1="https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874894/vllojqadc92x42xej1lm.pdf";
        String pdf2="https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874959/feebyuvspgtvrdciom4w.pdf";
        String pdf3="https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709875012/gu0uunycvbbrhfxotkdr.pdf";


        view.findViewById(R.id.showPreview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf",pdf));
            }
        });

        view.findViewById(R.id.showPreview1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf1",pdf1));
            }
        });
        view.findViewById(R.id.showPreview2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf2",pdf2));
            }
        });
        view.findViewById(R.id.showPreview3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf3",pdf3));
            }
        });

        view.findViewById(R.id.downloadTextView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileDownloader fileDownloader = new FileDownloader();
                fileDownloader.downloadFile(getContext(), pdf);
            }
        });

        view.findViewById(R.id.downloadTextView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileDownloader fileDownloader = new FileDownloader();
                fileDownloader.downloadFile(getContext(), pdf1);
            }
        });
        view.findViewById(R.id.downloadTextView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileDownloader fileDownloader=new FileDownloader();
                fileDownloader.downloadFile(getContext(),pdf2);
            }
        });
        view.findViewById(R.id.downloadTextView3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileDownloader fileDownloader = new FileDownloader();
                fileDownloader.downloadFile(getContext(), pdf3);
            }
        });

        return view;
    }


}