package com.example.deneme4;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class notDurumuDB extends SQLiteOpenHelper {

    public static final  String NOT_DATABASE = "veritabaniNot";
    public static final int DATABASE_VERSION = 1;
    public static final String NOT_DURUMU_TABLE = "notDurumu";

    public static final String ROW_DERS_ID = "ders";
    public static final String ROW_VIZE = "vize";
    public static final String ROW_FINAL = "final";



    public notDurumuDB(Context context) {
        super(context, NOT_DATABASE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + NOT_DURUMU_TABLE + "("+ROW_DERS_ID+" TEXT PRIMARY KEY, "+ROW_VIZE+" TEXT NOT NULL, "+ROW_FINAL+" TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL("DROP TABLE IF EXISTS " + NOT_DURUMU_TABLE);
        onCreate(db);

    }

    public void VeriEkle(String vize,String finall){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(ROW_VIZE,vize.trim());
        cv.put(ROW_FINAL,finall.trim());

        db.insert(NOT_DURUMU_TABLE,null,cv);
        db.close();
    }

    public List<String> VeriListele(){

        List<String> notlar = new ArrayList<String>();
        SQLiteDatabase db = this.getWritableDatabase();

        String[] sutunlar = {ROW_DERS_ID,ROW_VIZE,ROW_FINAL};

        Cursor cursor = db.query(NOT_DURUMU_TABLE, sutunlar,null,null,null,null,null);

        while (cursor.moveToNext()){

            notlar.add(cursor.getString(0) + " - " + cursor.getString(1) + " \n " + cursor.getString(2));

        }

        return notlar;

    }


}
