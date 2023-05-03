package com.example.milkman;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameView,cowMilkView,buffMilkView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.name);
        cowMilkView = itemView.findViewById(R.id.cowMilk);
        buffMilkView = itemView.findViewById(R.id.buffMilk);

    }
}
