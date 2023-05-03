package com.example.milkman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.cowMilkView.setText(String.valueOf(items.get(position).getCow()));
        holder.buffMilkView.setText(String.valueOf(items.get(position).getBuff()));


//        holder.cowMilkView.setText(items.get(position).getCow());
//        holder.buffMilkView.setText(items.get(position).getBuff());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
