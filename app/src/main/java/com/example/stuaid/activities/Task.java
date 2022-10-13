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
import com.example.stuaid.activities.Exams;
import com.example.stuaid.activities.Grades;
import com.example.stuaid.activities.Homepage;


public class Task extends AppCompatActivity {


    public void openActivityHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
        }
    public void openActivityNoten(){
        Intent intent = new Intent(this, Grades.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this, Exams.class);
        startActivity(intent);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

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

        Button homeButtonTodo = findViewById(R.id.home_button_todo);
        homeButtonTodo.setOnClickListener(v ->openActivityHomepage());

        Button planerButtonTodo = findViewById(R.id.exams_button_tasks);
        planerButtonTodo.setOnClickListener(v -> openActivityPlaner());

        Button notenButtonTodo = findViewById(R.id.grades_button_tasks);
        notenButtonTodo.setOnClickListener(v -> openActivityNoten());

    }
}


