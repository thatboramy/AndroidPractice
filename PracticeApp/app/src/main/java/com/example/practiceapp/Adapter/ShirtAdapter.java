package com.example.practiceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practiceapp.R;
import com.example.practiceapp.Shirt;

public class ShirtAdapter extends RecyclerView.Adapter<ShirtAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView shirttextView;
        public TextView colortextView;

        public MyViewHolder(View itemview) {
            super(itemview);

            shirttextView = (TextView) itemview.findViewById(R.id.shirt_textview);
            colortextView = (TextView) itemview.findViewById(R.id.color_textview);
        }
    }

    @NonNull
    @Override
    public ShirtAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View shirtView = inflater.inflate(R.layout.listitem_shirt, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(shirtView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShirtAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.shirttextView.setText(Shirt.shirts[i].name);
        myViewHolder.colortextView.setText(Shirt.shirts[i].color);
    }

    @Override
    public int getItemCount() {
        return Shirt.shirts.length;
    }
}
