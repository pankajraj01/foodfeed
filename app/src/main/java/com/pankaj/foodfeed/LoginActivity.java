package com.pankaj.foodfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btn_login, btn_fb, btn_gmail, btn_signup;
    EditText user_email, user_password;
    String str_email, str_password;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sessionManager = new SessionManager(LoginActivity.this);
        btn_fb = findViewById(R.id.btn_fb);
        btn_gmail = findViewById(R.id.btn_gmail);
        btn_login = findViewById(R.id.btn_login);
        btn_signup = findViewById(R.id.btn_signup);

        user_email = (EditText) findViewById(R.id.user_email);
        user_password = (EditText) findViewById(R.id.user_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_email = user_email.getText().toString().trim();
                str_password = user_password.getText().toString().trim();
                if (str_email.equals("")) {
                    Toast.makeText(LoginActivity.this, "Enter email", Toast.LENGTH_LONG).show();
                } else if (str_password.equals("")) {
                    Toast.makeText(LoginActivity.this, "Enter password", Toast.LENGTH_LONG).show();
                } else {
                    sessionManager.saveLogin(str_email, str_password);
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        });


        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btn_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Avalable Soon", Toast.LENGTH_LONG).show();
            }
        });

        btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Avalable Soon", Toast.LENGTH_LONG).show();
            }
        });

    }
}
