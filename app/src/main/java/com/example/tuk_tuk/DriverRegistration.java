package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registration);

        // Set a click listener on Signup Button

        Button signUpButton = (Button) findViewById(R.id.DriverSignUpButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the signup button is clicked.


            //enter code to signup here and function to send user to mainscreen is done below


            @Override
            public void onClick(View view) {
                Intent Driver_signup = new Intent(DriverRegistration.this, UserMainScreen.class);
                startActivity(Driver_signup);
            }

        });
    }


    public void sendOtp(){

        //this functiom will run when send otp in reset password is clicked

    }
}