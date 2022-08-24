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



            Button homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(v -> openActivityHomepage());
        }
}

