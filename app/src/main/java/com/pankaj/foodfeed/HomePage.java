package com.pankaj.foodfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Locale;

public class HomePage extends AppCompatActivity {

    GridView gv_food_cat;

    String[] cat_name = {"Fast Food", "Kebabs", "Chinese", "Pizza", "Thai", "Vegeterian"};
    Integer[] cat_icon = {R.drawable.fastfood, R.drawable.kebabs, R.drawable.chinese, R.drawable.pizza, R.drawable.thai, R.drawable.vegeterian};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        gv_food_cat = findViewById(R.id.gv_food_cat);

        CategoryAdapter adapter = new CategoryAdapter(HomePage.this, cat_icon, cat_name);
        gv_food_cat.setAdapter(adapter);

        gv_food_cat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Restaurant List for " + cat_name[i] , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(HomePage.this, RestaurantListActivity.class);
                startActivity(intent);
            }
        });

    }
}
