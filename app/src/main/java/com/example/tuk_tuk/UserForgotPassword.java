package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_forgot_password);

        // Set a click listener on Reset Password

        Button resetPasswordButton = (Button) findViewById(R.id.ResetPasswordButton);
        resetPasswordButton.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the Text View(Name) is clicked on.


            //enter code to reset password here and function to send user to login
            // screen is done below

            @Override
            public void onClick(View view) {
                Intent user_login = new Intent(UserForgotPassword.this, UserLogin.class);
                startActivity(user_login);
            }

        });

    }
    public void sendResetOtp(){

        //this functiom will run when send otp in reset password is clicked


    }


}