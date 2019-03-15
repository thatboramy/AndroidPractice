package com.example.practiceapp.Adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practiceapp.R;

public class HatAdapter extends RecyclerView.Adapter<HatAdapter.ViewHolder> {

    Context mcontext;
    Cursor mcursor;

    public HatAdapter(Context context, Cursor cursor) {
        mcontext = context;
        mcursor = cursor;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_hat, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public int getItemCount() {
        return mcursor.getCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView hatName;

        public ViewHolder(View itemView) {
            super(itemView);
            hatName = (TextView) itemView.findViewById(R.id.hat_textview);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        mcursor.moveToPosition(i);
        //myViewHolder.shirttextView.setText(Shirt.shirts[i].name);
        //myViewHolder.colortextView.setText(Shirt.shirts[i].color);
        //holder.bindCursor(mcursor);
        String currHatName = mcursor.getString(1);
        holder.hatName.setText(currHatName);
    }
}