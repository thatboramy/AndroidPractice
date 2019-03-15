package com.example.practiceapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.practiceapp.Adapter.HatAdapter;
import com.example.practiceapp.Database.HatDBHelper;

import java.util.ArrayList;

public class HatActivity extends AppCompatActivity {
    public HatDBHelper hatDB;
    public ArrayList<String> name;
    public RecyclerView recyclerView;
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager layoutManager;

    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            String temp = name.get(position);

            toastName(temp);
        }
    };

    private void toastName(String name) {
        Toast toast = Toast.makeText(this, "Item Clicked: " + name, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hat);

        hatDB = new HatDBHelper(this);
        name = hatDB.getALLNames();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_hat);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new HatAdapter(this, hatDB.getallData());
        recyclerView.setAdapter(mAdapter);
        ((HatAdapter) mAdapter).setOnItemClickListener(onItemClickListener);
    }
}
