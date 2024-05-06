package com.example.lenscorporation.event;

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


public class ECM extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view= inflater.inflate(R.layout.fragment_e_c_m, container, false);


        String pdf = "https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874259/rpaon7hr73ranyfhojne.pdf";
        String pdf1 = "https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874894/vllojqadc92x42xej1lm.pdf";
        String pdf2 = "https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709874959/feebyuvspgtvrdciom4w.pdf";
        String pdf3 = "https://res.cloudinary.com/duztqfzdj/image/upload/fl_attachment/v1709875012/gu0uunycvbbrhfxotkdr.pdf";


        view.findViewById(R.id.showPreview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf", pdf));
            }
        });

        view.findViewById(R.id.showPreview1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf1", pdf1));
            }
        });
        view.findViewById(R.id.showPreview2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf2", pdf2));
            }
        });
        view.findViewById(R.id.showPreview3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WebViewPDFPreview.class).putExtra("pdf3", pdf3));
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
                FileDownloader fileDownloader = new FileDownloader();
                fileDownloader.downloadFile(getContext(), pdf2);
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