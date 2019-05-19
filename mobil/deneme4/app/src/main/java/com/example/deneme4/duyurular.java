package com.example.deneme4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class duyurular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyurular);

    Button buton = (Button)findViewById(R.id.dbutton1);
    Button buton2 = (Button)findViewById(R.id.dbutton2);

    buton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(duyurular.this, Butunleme.class);
            startActivity(i);

        }
    });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent digerDuy = new Intent(duyurular.this, digerDuyurular.class);
                startActivity(digerDuy);

            }
        });

    }
}
