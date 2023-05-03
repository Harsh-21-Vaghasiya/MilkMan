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
        items.add(new Item("Ramesh R", 1, 3));
        items.add(new Item("Mahesh V", 5, 2));
        items.add(new Item("Ganesh A", 4, 7));
        items.add(new Item("Akash D", 2, 2));
        items.add(new Item("Luffy D", 1, 0));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //        error
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }
}