package com.example.deneme4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Veritabani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veritabani);



        final  EditText ders1 = (EditText)findViewById(R.id.ders1Edt);
        final  EditText ders2 = (EditText)findViewById(R.id.ders2Edt);

        Button kaydet = (Button)findViewById(R.id.kaydetBtn);

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                dersProgramiDB veritabani = new dersProgramiDB(Veritabani.this);
                veritabani.VeriEkle(ders1.getText().toString(),ders2.getText().toString());
            }
        });

        Button pazartesi = (Button)findViewById(R.id.pazartesiBtn);
        final ListView listView = (ListView)findViewById(R.id.veriler);
        pazartesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                dersProgramiDB veritabani = new dersProgramiDB(Veritabani.this);
                List<String> vVeriler = veritabani.VeriListele();
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Veritabani.this, android.R.layout.simple_list_item_1,android.R.id.text1, vVeriler);
                listView.setAdapter(adapter);
            }
        });


    }
}
