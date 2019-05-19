package com.example.deneme4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class dersProgramiDB extends SQLiteOpenHelper {

    public static final  String DATABASE_NAME = "veritabani";
    public static final int DATABASE_VERSION = 1;
    public static final String DERS_PROGRAMI_TABLE = "dersProgrami";

    public static final String ROW_ID = "id";
    public static final String ROW_DERS1 = "ders1";
    public static final String ROW_DERS2 = "ders2";

    public dersProgramiDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + DERS_PROGRAMI_TABLE + "("+ROW_ID+" INTEGER PRIMARY KEY, "+ROW_DERS1+" TEXT NOT NULL, "+ROW_DERS2+" TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + DERS_PROGRAMI_TABLE);
        onCreate(db);
    }

    public void VeriEkle(String ders1,String ders2){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(ROW_DERS1,ders1.trim());
        cv.put(ROW_DERS2,ders2.trim());

        db.insert(DERS_PROGRAMI_TABLE,null,cv);
        db.close();
    }


    public List<String> VeriListele(){

        List<String> veriler = new ArrayList<String>();
        SQLiteDatabase db = this.getWritableDatabase();

        String[] sutunlar = {ROW_ID,ROW_DERS1,ROW_DERS2};

        Cursor cursor = db.query(DERS_PROGRAMI_TABLE, sutunlar,null,null,null,null,null);

        while (cursor.moveToNext()){

            veriler.add(cursor.getInt(0) + " - " + cursor.getString(1) + " \n " + cursor.getString(2));

        }

        return veriler;

    }


}
