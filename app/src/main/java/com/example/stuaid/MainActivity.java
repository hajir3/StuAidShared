package com.example.stuaid;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 6000;

    

/*
    @SuppressWarnings("deprecation")
    private void hideSystemBars() {
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController == null) {
            return;
        }
        // Configure the behavior of the hidden system bars
        windowInsetsController.setSystemBarsBehavior(
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        );
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(),false);
        setContentView(R.layout.activity_main);
/*
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
*/

        //Hooks
        View first,second,third,fourth,fifth,sixth,seventh;
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

        Logo.setAnimation(middleAnimation);
        Tag.setAnimation(bottomAnimation);


        //Splash Screen

      /*  new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (MainActivity.this, secondActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);*/
    }
}