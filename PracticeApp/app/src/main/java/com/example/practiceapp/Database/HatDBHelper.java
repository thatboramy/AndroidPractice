package com.example.practiceapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class HatDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Hat";
    public static final int DB_VERSION = 1;

    public HatDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE HAT(_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, COLOR TEXT);");
        insertHat(db, "Beanie", "Brown");
        insertHat(db, "Fedora", "Blue");
        insertHat(db, "Bowler Hat", "Red");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS HAT");
        onCreate(db);
    }

    public static void insertHat(SQLiteDatabase db, String name, String color) {
        ContentValues hatValues = new ContentValues();
        hatValues.put("NAME", name);
        hatValues.put("COLOR", color);
        db.insert("HAT", null, hatValues);
    }

    public Cursor getallData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Hat", null);
        return res;
    }

    public ArrayList<String> getALLNames() {
        ArrayList<String> array_list = new ArrayList<String>();
        Cursor res = getallData();
        res.moveToFirst();

        while (res.isAfterLast() == false) {
            array_list.add(res.getString(res.getColumnIndex("NAME")));
            res.moveToNext();
        }
        return array_list;
    }
}
