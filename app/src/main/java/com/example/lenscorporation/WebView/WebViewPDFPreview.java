package com.example.lenscorporation.WebView;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lenscorporation.R;

public class WebViewPDFPreview extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_web_view_pdfpreview);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                final Uri uri = request.getUrl();
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        //  webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + getIntent().getStringExtra("pdf"));
        // webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + getIntent().getStringExtra("pdf1"));


        String pdfUrl = "";
        if (getIntent().hasExtra("pdf")) {
            pdfUrl = getIntent().getStringExtra("pdf");
        }
        if (getIntent().hasExtra("pdf1")) {
            pdfUrl = getIntent().getStringExtra("pdf1");
        } else if (getIntent().hasExtra("pdf2")) {
            pdfUrl = getIntent().getStringExtra("pdf2");
        } else if (getIntent().hasExtra("pdf3")) {
            pdfUrl = getIntent().getStringExtra("pdf3");
        } else if (getIntent().hasExtra("pdf")) {
            pdfUrl = getIntent().getStringExtra("pdf");
        }

        if (!pdfUrl.isEmpty()) {
            // Clear the WebView before loading a new URL
            webView.loadUrl("about:blank");
            webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + pdfUrl);




        }
    }
}