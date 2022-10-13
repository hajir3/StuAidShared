package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;


public class SplashScreen extends AppCompatActivity {


    private static final int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(),false);
        setContentView(R.layout.activity_splashscreen);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //Hooks
        View first,second,third,fourth,fifth,sixth,seventh,eight,ninth;
        TextView Tag,Logo;

        //Animations
        Animation topAnimation, bottomAnimation, middleAnimation;

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //Hooks
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seventh = findViewById(R.id.seventh);
        eight = findViewById(R.id.eighth);
        ninth = findViewById(R.id.ninth);

        Logo = findViewById(R.id.Logo);
        Tag = findViewById(R.id.Tag);


        //setting Animations
        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        fourth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);
        seventh.setAnimation(topAnimation);
        eight.setAnimation(topAnimation);
        ninth.setAnimation(topAnimation);

        Logo.setAnimation(middleAnimation);
        Tag.setAnimation(bottomAnimation);


        //Splash Screen

        new Handler().postDelayed(() -> {
            Intent intent = new Intent (SplashScreen.this, Homepage.class);
            startActivity(intent);
            finish();
        },SPLASH_TIME_OUT);
    }
}