package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provider_Verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_verification);
    }

    public void  conti(View view)
    {
        Intent intent = new Intent(Provider_Verification.this, Call_Register_Activity.class);
        startActivity(intent);
        finish();
    }
}