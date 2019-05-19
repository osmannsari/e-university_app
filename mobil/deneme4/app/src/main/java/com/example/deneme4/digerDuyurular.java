package com.example.deneme4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class digerDuyurular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diger_duyurular);


        WebView veb = (WebView)findViewById(R.id.veb);
        veb.loadUrl("http://gazi.edu.tr/posts?type=news");
        veb.getSettings().setLoadsImagesAutomatically(true);
        veb.getSettings().setJavaScriptEnabled(true);

        veb.setWebViewClient(new WebViewClient());


    }
}
