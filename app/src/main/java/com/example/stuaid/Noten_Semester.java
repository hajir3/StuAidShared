package com.example.stuaid;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Noten_Semester extends AppCompatActivity {

    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);


    }

}