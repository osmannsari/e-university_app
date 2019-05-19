package com.example.deneme4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class VeritabaniDevamsizlik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veritabani_devamsizlik);



        final EditText ders1 = (EditText)findViewById(R.id.ders);
        final  EditText ders2 = (EditText)findViewById(R.id.devSaati);

        Button kaydet = (Button)findViewById(R.id.devKydt);

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                devamsizlikDB veritabani = new devamsizlikDB(VeritabaniDevamsizlik.this);
                veritabani.VeriEkle(ders1.getText().toString(),ders2.getText().toString());
            }
        });

        Button pazartesi = (Button)findViewById(R.id.devGoster);
        final ListView listView = (ListView)findViewById(R.id.devamsizlik);
        pazartesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                devamsizlikDB veritabani = new devamsizlikDB(VeritabaniDevamsizlik.this);
                List<String> vVeriler = veritabani.VeriListele();
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(VeritabaniDevamsizlik.this, android.R.layout.simple_list_item_1,android.R.id.text1, vVeriler);
                listView.setAdapter(adapter);
            }
        });

    }
}
