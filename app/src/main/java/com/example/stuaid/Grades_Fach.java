package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Grades_Fach extends AppCompatActivity {


    public void openActivityHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
    public void openActivityGrades_Semester(){
        Intent intent = new Intent(this, Grades_Semester.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_fach);
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

        Button backButton = findViewById(R.id.back_button_grades_fach);
        backButton.setOnClickListener(v -> openActivityGrades_Semester());


        Button homeButton = findViewById(R.id.home_button_grades_fach);
        homeButton.setOnClickListener(v -> openActivityHomepage());



        /* import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Toast;

        public class Noten_Fach extends AppCompatActivity {
            RelativeLayout layout;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_noten_fach);
                layout = findViewById(R.id.relativeLayout);
                layout.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
                    @Override
                    public void onSwipeLeft() {
                        super.onSwipeLeft();
                        Toast.makeText(MainActivity.this, "Swipe Left gesture detected", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onSwipeRight() {
                        super.onSwipeRight();
                        Toast.makeText(MainActivity.this, "Swipe Right gesture detected", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
        */

    }

}