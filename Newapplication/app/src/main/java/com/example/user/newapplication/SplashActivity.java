package com.example.user.newapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.user.newapplication.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.splashactivity);
        findViewById(R.id.logo).startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivity(new Intent(SplashActivity.this,MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        Animation myani;
        myani=AnimationUtils.loadAnimation(this,R.anim.txtsplash);
        findViewById(R.id.tv1).startAnimation(myani);
        myani.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation myanim) {

            }

            @Override
            public void onAnimationEnd(Animation myanim) {

            }

            @Override
            public void onAnimationRepeat(Animation myanim) {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        });
    }


    public void clockwise(View view){
        ImageView logo = findViewById(R.id.logo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.splashactivity);
        logo.startAnimation(animation);
    }
}