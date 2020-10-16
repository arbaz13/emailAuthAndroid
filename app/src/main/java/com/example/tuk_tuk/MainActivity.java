package com.example.tuk_tuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.Name);


        // Set a click listener on that Name
        name.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Text View(Name) is clicked on.

            @Override
            public void onClick(View view) {
                Intent main_intent = new Intent(MainActivity.this, UserLogin.class);
                startActivity(main_intent);
            }

        });
    }
}