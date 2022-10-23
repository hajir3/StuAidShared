package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Grades extends AppCompatActivity {

    public void openActivityHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this, Exams.class);
        startActivity(intent);
    }
    public void openActivityToDo() {
        Intent intent = new Intent(this, Task.class);
        startActivity(intent);
    }

    public void openActivityNoten_Semester(){
        Intent intent = new Intent(this, Grades_Semester.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);
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


        Button planerButtonNoten = findViewById(R.id.exams_button_grades);
        planerButtonNoten.setOnClickListener(v -> openActivityPlaner());

        Button todoButtonNoten = findViewById(R.id.tasks_button_grades);
        todoButtonNoten.setOnClickListener(v -> openActivityToDo());

        Button homeButtonNoten = findViewById(R.id.home_button_grades);
        homeButtonNoten.setOnClickListener(v -> openActivityHomepage());

    }
}

