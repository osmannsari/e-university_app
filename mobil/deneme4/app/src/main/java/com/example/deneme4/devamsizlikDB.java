package com.example.deneme4;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class devamsizlikDB extends SQLiteOpenHelper {


    public static final String DEVAMSIZLIK_DATABASE = "veritabaniDevamsizlik";
    public static final int DATABASE_VERSION = 1;
    public static final String DEVAMSIZLIK_TABLE = "devamsizlik";

    public static final String ROW_ID = "id";
    public static final String ROW_DERS = "ders";
    public static final String ROW_DEV_SAAT = "devSaati";


    public devamsizlikDB(Context context) {
        super(context, DEVAMSIZLIK_DATABASE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + DEVAMSIZLIK_TABLE + "(" + ROW_ID + " INTEGER PRIMARY KEY, " + ROW_DERS + " TEXT NOT NULL, " + ROW_DEV_SAAT + " TEXT NOT NULL)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + DEVAMSIZLIK_TABLE);
        onCreate(db);


    }


    public void VeriEkle(String ders, String devSaat) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(ROW_DERS, ders.trim());
        cv.put(ROW_DEV_SAAT, devSaat.trim());

        db.insert(DEVAMSIZLIK_TABLE, null, cv);
        db.close();
    }


    public List<String> VeriListele() {

        List<String> devamsizlik = new ArrayList<String>();
        SQLiteDatabase db = this.getWritableDatabase();

        String[] sutunlar = {ROW_ID, ROW_DERS, ROW_DEV_SAAT};

        Cursor cursor = db.query(DEVAMSIZLIK_TABLE, sutunlar, null, null, null, null, null);

        while (cursor.moveToNext()) {

            devamsizlik.add(cursor.getInt(0) + " - " + cursor.getString(1) + " \n " + cursor.getString(2));

        }

        return devamsizlik;

    }
}