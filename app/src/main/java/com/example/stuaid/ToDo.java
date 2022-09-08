package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;


    public class ToDo extends AppCompatActivity {


    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
        }
    public void openActivityNoten(){
        Intent intent = new Intent(this,Noten.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this,Planer.class);
        startActivity(intent);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

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

        Button planerButtonTodo = findViewById(R.id.planer_button_todo);
        planerButtonTodo.setOnClickListener(v -> openActivityPlaner());

        Button notenButtonTodo = findViewById(R.id.noten_button_todo);
        notenButtonTodo.setOnClickListener(v -> openActivityNoten());

    }
}


