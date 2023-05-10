package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Add_Provider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_provider);
    }


    public void  homes(View view)
    {
        Intent intent = new Intent(Add_Provider.this, Provider_More.class);
        startActivity(intent);
        finish();
    }
}