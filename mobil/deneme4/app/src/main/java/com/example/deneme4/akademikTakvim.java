package com.example.deneme4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;


public class akademikTakvim extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik_takvim);

        PDFView pdfView = (PDFView)findViewById(R.id.pdfView);

        pdfView.fromAsset("akademik.pdf").load();


    }
}
