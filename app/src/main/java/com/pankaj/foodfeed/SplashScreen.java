package com.pankaj.foodfeed;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        sessionManager = new SessionManager(SplashScreen.this);
        handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sessionManager.IsLogin()) {
                    Intent intent = new Intent(SplashScreen.this, HomePage.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(SplashScreen.this, SignupActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 3000);
    }
}
