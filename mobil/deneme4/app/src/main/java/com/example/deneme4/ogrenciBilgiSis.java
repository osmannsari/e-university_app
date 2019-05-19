package com.example.deneme4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class ogrenciBilgiSis extends AppCompatActivity {


    Button buton1,buton2,buton3,buton4,home;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrenci_bilgi_sis);


        home = (Button)findViewById(R.id.homeBtn);
        buton1 = (Button)findViewById(R.id.obsbutton1);
        buton2 = (Button)findViewById(R.id.obsbutton2);
        buton3 = (Button)findViewById(R.id.obsbutton3);
        buton4 = (Button)findViewById(R.id.obsbutton4);

        buton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(ogrenciBilgiSis.this, Veritabani.class);
                startActivity(i);


            }
        });

        home.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent dersProgSay = new Intent(ogrenciBilgiSis.this, GaziBilgiSistemi.class);
                startActivity(dersProgSay);

            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent notlarSay = new Intent(ogrenciBilgiSis.this, VeritabaniNot.class);
                startActivity(notlarSay);

            }
        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent devamSay = new Intent(ogrenciBilgiSis.this, VeritabaniDevamsizlik.class);
                startActivity(devamSay);

            }
        });


        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent butunlemeSay = new Intent(ogrenciBilgiSis.this, Butunleme.class);
                startActivity(butunlemeSay);

            }
        });



}
}
