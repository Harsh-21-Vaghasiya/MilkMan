package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.milkman.GLOBAL.Gloabal_details;
import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class SignUP extends AppCompatActivity {
    TextInputEditText textInputEditTextFullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextAddress, textInputEditTextMobileNo;
    Button buttonSignUp;
    TextView textViewLogin;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        textInputEditTextAddress = findViewById(R.id.address);
        textInputEditTextFullname = findViewById(R.id.fullname);
        textViewLogin = findViewById(R.id.loginText);
        textInputEditTextPassword = findViewById(R.id.password);
        textInputEditTextUsername = findViewById(R.id.username);
        textInputEditTextMobileNo = findViewById(R.id.signuppagemobileno);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        progressBar = findViewById(R.id.progress);


        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username, password, address, fullname, mobileno;
                fullname = String.valueOf(textInputEditTextFullname.getText());
                username = String.valueOf(textInputEditTextUsername.getText());
                address = String.valueOf(textInputEditTextAddress.getText());
                password = String.valueOf(textInputEditTextPassword.getText());
                mobileno = String.valueOf(textInputEditTextMobileNo.getText());

// cheaking for the value of above filelds is null or not

                if (!fullname.equals("") && !username.equals("") && !address.equals("") && !password.equals("")) {

                    progressBar.setVisibility(View.VISIBLE);

                    //Start ProgressBar first (Set visibility VISIBLE)
                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[5];
                            field[0] = "fullname";
                            field[1] = "username";
                            field[2] = "password";
                            field[3] = "address";
                            field[4] = "mobileno";


                            //Creating array for data
                            String[] data = new String[5];
                            data[0] = fullname;
                            data[1] = username;
                            data[2] = password;
                            data[3] = address;
                            data[4] = mobileno;
                            PutData putData = new PutData("http://" + Gloabal_details.IP + ":" + Gloabal_details.PORT + "/milkman/milkmanserver/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {

                                    progressBar.setVisibility(View.GONE);
                                    String result = putData.getResult();
                                    if (result.equals("Sign Up Success")) {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

                                        Intent intent = new Intent(SignUP.this, Login.class);
                                        startActivity(intent);
                                        finish();

                                    } else {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                                    }
                                    //End ProgressBar (Set visibility to GONE)
                                }
                            }
                            //End Write and Read data with URL
                        }
                    });
                } else {
                    Toast.makeText(getApplicationContext(), "All the fields are required", Toast.LENGTH_LONG).show();
                }
            }
        });


        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUP.this, Login.class);
                startActivity(intent);
                finish();
            }
        });


    }
}