package com.example.deneme4;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class GaziBilgiSistemi extends AppCompatActivity {

    // Button buton,etkBtn,duyuru,OBS,yemek;
    EditText edit1,edit2;
    String kullaniciAdi = "151816071";
    String sifre = "0000";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazi_bilgi_sistemi);

       /* yemek = (Button)findViewById(R.id.ymkBtn);
        OBS = (Button)findViewById(R.id.ogrenBSBtn);
        duyuru = (Button)findViewById(R.id.dururuBtn);
        etkBtn = (Button)findViewById(R.id.etkBtn);*/
        Button buton = (Button) findViewById(R.id.button);
        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);

        edit1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                edit1.setText("");
            }
        });

        edit2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                edit2.setText("");
            }
        });

        buton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(edit1.getText().toString().equals(kullaniciAdi) && edit2.getText().toString().equals(sifre)){

                    Intent sayfa = new Intent(GaziBilgiSistemi.this, ogrenciBilgiSis.class );
                    startActivity(sayfa);
                }else Toast.makeText(GaziBilgiSistemi.this,"Öğrenci numaranız veya şifreniz yanlış!",Toast.LENGTH_LONG).show();

            }
        });
/*
        etkBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent kolayEtkinlikSayfasi = new Intent(GaziBilgiSistemi.this, etkinlikler.class);
                startActivity(kolayEtkinlikSayfasi);

            }
        });

        duyuru.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent kolayEtkinlikSayfasi = new Intent(GaziBilgiSistemi.this, duyurular.class);
                startActivity(kolayEtkinlikSayfasi);

            }
        });

        OBS.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(edit1.getText().toString().equals(kullaniciAdi) && edit2.getText().toString().equals(sifre)){

                    Intent sayfa = new Intent(GaziBilgiSistemi.this, ogrenciBilgiSis.class );
                    startActivity(sayfa);
                }
                else Toast.makeText(GaziBilgiSistemi.this,"Öğrenci numaranız ve şifrenizle giriş yapmalısınız!",Toast.LENGTH_LONG).show();

            }
        });

        yemek.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent kolayEtkinlikSayfasi = new Intent(GaziBilgiSistemi.this, yemekListesi.class);
                startActivity(kolayEtkinlikSayfasi);

            }
        });*/


        ImageView icon=new ImageView(this);
        icon.setImageResource(R.drawable.add_green);
        final FloatingActionButton fab=new FloatingActionButton.Builder(this).setContentView(icon).build();

        SubActionButton.Builder builder=new SubActionButton.Builder(this);

        ImageView deleteIcon=new ImageView(this);
        deleteIcon.setImageResource(R.drawable.cook);
        SubActionButton deleteBtn=builder.setContentView(deleteIcon).build();

        ImageView removeIcon=new ImageView(this);
        removeIcon.setImageResource(R.drawable.duyuru_icon);
        SubActionButton removeBtn=builder.setContentView(removeIcon).build();


        ImageView addIcon=new ImageView(this);
        addIcon.setImageResource(R.drawable.etkinlikkk);
        SubActionButton addBtn=builder.setContentView(addIcon).build();

        ImageView aIcon=new ImageView(this);
        aIcon.setImageResource(R.drawable.ogtre);
        SubActionButton aBtn=builder.setContentView(aIcon).build();


        final FloatingActionMenu fam=new FloatingActionMenu.Builder(this)
                .addSubActionView(addBtn)
                .addSubActionView(removeBtn)
                .addSubActionView(deleteBtn)
                .addSubActionView(aBtn)
                .attachTo(fab)
                .build();


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GaziBilgiSistemi.this, "Etkinlikler", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(GaziBilgiSistemi.this, etkinlikler.class);

                GaziBilgiSistemi.this.startActivity(i);
            }
        });
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GaziBilgiSistemi.this, "Duyurular", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(GaziBilgiSistemi.this, duyurular.class);

                GaziBilgiSistemi.this.startActivity(i);
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GaziBilgiSistemi.this, "Yemek Listesi", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(GaziBilgiSistemi.this, yemekListesi.class);

                GaziBilgiSistemi.this.startActivity(i);
            }
        });

        aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edit1.getText().toString().equals(kullaniciAdi) && edit2.getText().toString().equals(sifre)){




                    Toast.makeText(GaziBilgiSistemi.this, "Öğrenci Bilgi Sistemi", Toast.LENGTH_SHORT).show();
                    fam.close(true);

                    Intent i=new Intent(GaziBilgiSistemi.this, ogrenciBilgiSis.class);

                    GaziBilgiSistemi.this.startActivity(i);

                }else Toast.makeText(GaziBilgiSistemi.this,"Öğrenci numaranız veya şifreniz yanlış!",Toast.LENGTH_LONG).show();

            }
        });




    }
}
