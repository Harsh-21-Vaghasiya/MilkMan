package com.example.milkman;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class acitivity_task_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        Item item;


        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Harsh", 1, 3));
        items.add(new Item("Manav", 5, 2));
        items.add(new Item("Utsav", 4, 7));
        items.add(new Item("Himansu", 2, 2));
        items.add(new Item("Kirtan", 1, 0));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //        error
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }
}