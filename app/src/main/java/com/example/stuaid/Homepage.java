package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Homepage extends AppCompatActivity {

    public void openActivityPlaner() {
        Intent intent = new Intent(this,Planer.class);
        startActivity(intent);
    }
    public void openActivityNoten() {
        Intent intent = new Intent(this,Noten.class);
        startActivity(intent);
    }
    public void openActivityToDo() {
        Intent intent = new Intent(this,ToDo.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button planerButton = findViewById(R.id.planer_button);
        planerButton.setOnClickListener(v -> openActivityPlaner());
        Button notenButton = findViewById(R.id.noten_button);
        notenButton.setOnClickListener(v -> openActivityNoten());
        Button todoButton = findViewById(R.id.todo_button);
        todoButton.setOnClickListener(v -> openActivityToDo());
    }

}