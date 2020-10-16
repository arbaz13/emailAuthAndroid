package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DriverLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        // Set a click listener on Switch to user

        TextView switchToUser = (TextView) findViewById(R.id.Stu);

        switchToUser.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Text View(Switch to user) is clicked on.

            @Override
            public void onClick(View view) {
                Intent switch_to_user = new Intent(DriverLogin.this, UserLogin.class);
                startActivity(switch_to_user);
            }

        });

// Set a click listener on Forgot password

        TextView forgotPassword = (TextView) findViewById(R.id.ForgotPassword);

        forgotPassword.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the forget password is clicked on.

            @Override
            public void onClick(View view) {
                Intent forgot_password = new Intent(DriverLogin.this, UserForgotPassword.class);
                startActivity(forgot_password);
            }

        });
// Set a click listener on login button

        Button driverlogin = (Button) findViewById(R.id.DLogin);

        driverlogin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login button is clicked on.

            @Override
            public void onClick(View view) {
                Intent driver_login = new Intent(DriverLogin.this, DriverMainScreen.class);
                startActivity(driver_login);
            }

        });

        // Set a click listener on registration button
        Button driverRegistration = (Button) findViewById(R.id.DRegistration);

        driverRegistration.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login button is clicked on.

            @Override
            public void onClick(View view) {
                Intent driver_registration = new Intent(DriverLogin.this, DriverRegistration.class);
                startActivity(driver_registration);
            }

        });
    }
}