package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Grades_Semester extends AppCompatActivity {

    public void openActivityHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
    public void openActivityNoten_Fach(){
        Intent intent = new Intent(this, Grades_Fach.class);
        startActivity(intent);}
    public void openActivityGrades(){
        Intent intent = new Intent(this, Grades.class);
        startActivity(intent);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_semester);
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



        Button homeButton = findViewById(R.id.home_button_grades_semster);
        homeButton.setOnClickListener(v -> openActivityHomepage());

        Button test2Button = findViewById(R.id.test2);
        test2Button.setOnClickListener(v -> openActivityNoten_Fach());

        Button backButton = findViewById(R.id.back_button_grades_semester);
        backButton.setOnClickListener(v -> openActivityGrades());
    }
}
