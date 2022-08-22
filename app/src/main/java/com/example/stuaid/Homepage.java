package com.example.stuaid;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
}