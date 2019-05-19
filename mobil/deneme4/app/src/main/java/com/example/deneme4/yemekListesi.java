package com.example.deneme4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class yemekListesi extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_listesi);


        WebView webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("http://mediko.gazi.edu.tr/posts/view/title/yemek-listesi-20412");
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

    }
}
