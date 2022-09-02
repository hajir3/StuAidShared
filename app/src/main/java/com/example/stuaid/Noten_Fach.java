package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Noten_Fach extends AppCompatActivity {

    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noten_fach);

        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v ->openActivityHomepage());

// hier
        import androidx.appcompat.app.AppCompatActivity;
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
        // bis hier

    }

}