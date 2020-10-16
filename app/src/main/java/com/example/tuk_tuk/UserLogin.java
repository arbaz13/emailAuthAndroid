package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);


// Set a click listener on Switch to driver

        TextView switchToDriver = (TextView) findViewById(R.id.Std);

        switchToDriver.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the Text View(Switch to driver) is clicked on.

            @Override
            public void onClick(View view) {
                Intent switch_to_driver = new Intent(UserLogin.this, DriverLogin.class);
                startActivity(switch_to_driver);
            }

        });

// Set a click listener on Forgot password

        TextView forgotPassword = (TextView) findViewById(R.id.ForgotPassword);

        forgotPassword.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Text View(forget passsword) is clicked on.

            @Override
            public void onClick(View view) {
                Intent forgot_password = new Intent(UserLogin.this, UserForgotPassword.class);
                startActivity(forgot_password);
            }

        });
// Set a click listener on login button

        Button login = (Button) findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login button is clicked on.

            @Override
            public void onClick(View view) {
                Intent login_intent = new Intent(UserLogin.this, UserMainScreen.class);
                startActivity(login_intent);
            }

        });

        // Set a click listener on registration button

        Button registration = (Button) findViewById(R.id.Registration);

        registration.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the register button is clicked on.

            @Override
            public void onClick(View view) {
                Intent registration_intent = new Intent(UserLogin.this, UserRegistration.class);
                startActivity(registration_intent);

            }

        });


    }
}