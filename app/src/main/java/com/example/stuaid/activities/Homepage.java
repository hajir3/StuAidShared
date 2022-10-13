package com.example.stuaid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.example.stuaid.R;


public class Homepage extends AppCompatActivity {


    public void openActivityPlaner() {
        Intent intent = new Intent(this, Exams.class);
        startActivity(intent);
    }
    public void openActivityNoten() {
        Intent intent = new Intent(this, Grades.class);
        startActivity(intent);
    }
    public void openActivityToDo() {
        Intent intent = new Intent(this, Task.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController == null) {
            return;
        }
        windowInsetsController.setAppearanceLightNavigationBars(true);
        windowInsetsController.setAppearanceLightStatusBars(true);






        Button planerButton = findViewById(R.id.exams_button_homepage);
        planerButton.setOnClickListener(v -> openActivityPlaner());
        Button notenButton = findViewById(R.id.grades_button_homepage);
        notenButton.setOnClickListener(v -> openActivityNoten());
        Button todoButton = findViewById(R.id.tasks_button_hompage);
        todoButton.setOnClickListener(v -> openActivityToDo());
    }
}