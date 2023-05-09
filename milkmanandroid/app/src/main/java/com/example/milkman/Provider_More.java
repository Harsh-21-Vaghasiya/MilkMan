package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provider_More extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_more);
    }




    public void  nexttoproviderseles(View view)
    {
        Intent intent = new Intent(Provider_More.this, acitivity_task_list.class);
        startActivity(intent);
        finish();
    }
    public void profilePage(View view){
        Intent intent = new Intent(Provider_More.this,Customer_Profile.class);
        startActivity(intent);
        finish();
    }
    public void SalesPage(View view){
        Intent intent = new Intent(Provider_More.this,Provider_Sales.class);
        startActivity(intent);
        finish();
    }

    public void Logout(View view){
        Intent intent = new Intent(Provider_More.this, Login.class);
        startActivity(intent);
        finish();
    }


}