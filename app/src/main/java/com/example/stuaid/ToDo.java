package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ToDo extends AppCompatActivity {


    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do;

        Button homeButton2 = findViewById(R.id.home_button2);
        homeButton2.setOnClickListener(v ->openActivityHomepage());

    }
}


