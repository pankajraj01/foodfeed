package com.pankaj.foodfeed;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class RestaurantListActivity extends AppCompatActivity {

    ListView lv_rest_list;

    Integer[] iv_company_logo = {R.drawable.noodles_company, R.drawable.subway_company, R.drawable.dunkin, R.drawable.jack_in_the_box, R.drawable.pizza_hut, R.drawable.chai_thali, R.drawable.dominos};
    String[] tv_company_name = {"The Noodle", "Subway", "Dunkin Donuts", "Jack in the box", "Pizza Hut", "Chai Thali", "Domino's"};
    Integer[] tv_delivery_charge = {25, 30, 25, 30, 25, 50, 30, 50};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        lv_rest_list = findViewById(R.id.lv_rest_list);

        RestaurantListAdapter adapter = new RestaurantListAdapter(RestaurantListActivity.this, iv_company_logo, tv_company_name, tv_delivery_charge);
        lv_rest_list.setAdapter(adapter);

        lv_rest_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RestaurantListActivity.this,"Clicked",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RestaurantListActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

//        lv_rest_list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(RestaurantListActivity.this, MenuActivity.class);
//                startActivity(intent);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });


    }
}
