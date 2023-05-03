package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.milkman.GLOBAL.Gloabal_details;

import java.util.Locale;

public class firstpage extends AppCompatActivity {

    Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        login=findViewById(R.id.firstpagelogin);
        signup=findViewById(R.id.firstpagesignup);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(firstpage.this,Login.class);
                startActivity(intent);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(firstpage.this,Call_Register_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    public void change_lang(View view){
        try {
            String lang = "en";
            switch (view.getId()) {
                case R.id.select_english:
                    lang = "en";
                    break;
                case R.id.select_hindi:
                    lang = "hi";
                    break;
                case R.id.select_gujrati:
                    lang = "gu";
                    break;
                default:
                    lang = "en";
                    break;
            }
            Gloabal_details gd = new Gloabal_details();
            gd.change_language(lang, firstpage.this);
            finish();
            startActivity(getIntent());
        }catch(Exception e){
            Log.e("errorr","error in language changing in first page as "+e.getMessage());
        }
    }
}