package com.example.practiceapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.practiceapp.Adapter.HatAdapter;
import com.example.practiceapp.Database.HatDBHelper;

import java.util.ArrayList;

public class HatActivity extends AppCompatActivity {
    public HatDBHelper hatDB;

    public RecyclerView recyclerView;
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hat);

        hatDB = new HatDBHelper(this);
        ArrayList<String> name = hatDB.getALLNames();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_hat);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new HatAdapter(this, hatDB.getallData());
        recyclerView.setAdapter(mAdapter);
    }
}
