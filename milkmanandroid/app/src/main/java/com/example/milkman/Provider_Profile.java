package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provider_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_profile);
    }

    public void  nexttoproviderhome(View view)
    {
        Intent intent = new Intent(Provider_Profile.this, Provider_Home.class);
        startActivity(intent);
        finish();
    }
}