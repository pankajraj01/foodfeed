package com.pankaj.foodfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_find_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_find_food = findViewById(R.id.btn_find_food);

        btn_find_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                Toast.makeText(MainActivity.this, "Welcome to foodfeed", Toast.LENGTH_LONG).show();
                startActivity(intent);
                finish();
            }
        });

    }
}
