package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.example.milkman.GLOBAL.Gloabal_details;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class Otp_Validation extends AppCompatActivity {
    TextInputLayout Enter_Your_Opt_Text_Box;
//    TextInputEditText Otp;
//    Button buttonOtp;
    AppCompatButton buttonOtp;
    PinView Otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_validation);


//        Enter_Your_Opt_Text_Box = findViewById(R.id.Enter_Your_Opt_Text_Box);
        Otp = findViewById(R.id.pin_view);
        buttonOtp = findViewById(R.id.buttonOtp);


        buttonOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String androidOtp;
                androidOtp = String.valueOf(Otp.getText());

                if (!androidOtp.equals("")) {


                    //Start ProgressBar first (Set visibility VISIBLE)
                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //Starting Write and Read data with URL
                            //Creating array for parameters
                            String[] field = new String[1];
                            field[0] = "sendotp";


                            //Creating array for data
                            String[] data = new String[1];
                            data[0] = androidOtp;
                            PutData putData = new PutData("http://"+Gloabal_details.IP+":"+ Gloabal_details.PORT +"/milkman/milkmanserver/otp_authentication.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {

                                    String result = putData.getResult();
                                    if (result.equals("Login Success")) {


                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

                                        Intent intent=new Intent(Otp_Validation.this,acitivity_task_list.class);
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

    }
}