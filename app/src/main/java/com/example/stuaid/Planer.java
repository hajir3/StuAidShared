package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class Planer extends AppCompatActivity {


    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
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
        setContentView(R.layout.activity_planer);

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

        Button homeButton3 = findViewById(R.id.home_button3);
        homeButton3.setOnClickListener(v ->openActivityHomepage());
        Button notenButton = findViewById(R.id.noten_button);
        notenButton.setOnClickListener(v -> openActivityNoten());
        Button todoButton = findViewById(R.id.todo_button);
        todoButton.setOnClickListener(v -> openActivityToDo());
    }
}


