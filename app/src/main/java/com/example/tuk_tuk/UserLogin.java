package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        TextView switchToDriver = (TextView) findViewById(R.id.Std);


        // Set a click listener on that Name
        switchToDriver.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Text View(Std) is clicked on.

            @Override
            public void onClick(View view) {
                Intent SwitchToDriver = new Intent(UserLogin.this, DriverLogin.class);
                startActivity(SwitchToDriver);
            }

        });
    }
}