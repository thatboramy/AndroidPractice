package com.example.practiceapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.practiceapp.Database.HatDBHelper;

import java.util.ArrayList;

public class HatActivity extends AppCompatActivity {
    public HatDBHelper hatDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hat);

        hatDB = new HatDBHelper(this);
        ArrayList<String> name = hatDB.getALLNames();
    }
}
