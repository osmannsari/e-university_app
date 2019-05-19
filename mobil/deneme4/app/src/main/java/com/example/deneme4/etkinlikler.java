package com.example.deneme4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class etkinlikler extends AppCompatActivity {

    Button buton1,buton2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlikler);

            buton1 = (Button)findViewById(R.id.ebutton1);
            buton2 = (Button)findViewById(R.id.ebutton2);

            buton1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    Intent akademikSay = new Intent(etkinlikler.this, akademikTakvim.class);
                    startActivity(akademikSay);

                }
            });


            buton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent digerEtk = new Intent(etkinlikler.this, DigerEtkinlikler.class);
                startActivity(digerEtk);

            }
        });


    }
}
