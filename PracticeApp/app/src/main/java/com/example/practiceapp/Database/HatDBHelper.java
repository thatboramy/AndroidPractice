package com.example.practiceapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HatDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Hat";
    public static final int DB_VERSION = 1;

    public HatDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE HAT(_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, COLOR TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS HAT");
        onCreate(db);
    }
}
