package com.example.practiceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.practiceapp.Adapter.ShirtAdapter;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public RecyclerView.Adapter mAdapter;

    public RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_shirt);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ShirtAdapter();
        recyclerView.setAdapter(mAdapter);
    }
}
