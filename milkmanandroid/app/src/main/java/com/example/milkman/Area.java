package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }

    public void  homes(View view)
    {
        Intent intent = new Intent(Area.this, Provider_More.class);
        startActivity(intent);
        finish();
    }
}