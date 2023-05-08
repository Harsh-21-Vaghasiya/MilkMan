package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provider_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_home);
    }

    public void  nexttoprovidermore(View view)
    {
        Intent intent = new Intent(Provider_Home.this, Provider_More.class);
        startActivity(intent);
        finish();
    }
}