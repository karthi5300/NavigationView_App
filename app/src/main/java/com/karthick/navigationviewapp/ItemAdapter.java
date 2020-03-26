package com.karthick.navigationviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Iterator;

class ItemAdapter extends RecyclerView.Adapter {

    private int[] items;

    ItemAdapter(int[] items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item, parent, false);
        ItemViewHolder ivh = new ItemViewHolder(view);
        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ItemViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_imageview);
        }

        public void bindView(int position) {
            imageView.setImageResource(items[position]);
        }
    }
}
