package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Noten extends AppCompatActivity {

    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this,Planer.class);
        startActivity(intent);
    }
    public void openActivityToDo() {
        Intent intent = new Intent(this,ToDo.class);
        startActivity(intent);
    }

    public void openActivityNoten_Semester(){
        Intent intent = new Intent(this,Noten_Semester.class);
        startActivity(intent);}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noten);
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



        Button planerButtonNoten = findViewById(R.id.planer_button_noten);
        planerButtonNoten.setOnClickListener(v -> openActivityPlaner());

        Button todoButtonNoten = findViewById(R.id.todo_button_noten);
        todoButtonNoten.setOnClickListener(v -> openActivityToDo());

        Button homeButtonNoten = findViewById(R.id.home_button_noten);
        homeButtonNoten.setOnClickListener(v -> openActivityHomepage());



        Button testButton = findViewById(R.id.test);
        testButton.setOnClickListener(v -> openActivityNoten_Semester());
    }


}

