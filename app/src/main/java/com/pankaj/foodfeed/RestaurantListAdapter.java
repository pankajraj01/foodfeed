package com.pankaj.foodfeed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.zip.Inflater;

public class RestaurantListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Integer[] iv_company_logo;
    private String[] tv_company_name;
    private Integer[] tv_delivery_charge;
    private Context context;
    private RelativeLayout rl_rest_list;


    public RestaurantListAdapter(Context c, Integer[] iv_company_logo, String[] tv_company_name, Integer[] tv_delivery_charge) {

        this.context = c;
        this.iv_company_logo = iv_company_logo;
        this.tv_company_name = tv_company_name;
        this.tv_delivery_charge = tv_delivery_charge;

    }

    @Override
    public int getCount() {
        return iv_company_logo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return iv_company_logo.length;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null) {
            view = inflater.inflate(R.layout.restaurant_list, null);
        }

        ImageView logo = view.findViewById(R.id.iv_rest_logo);
        TextView name = view.findViewById(R.id.tv_rest_name);
        TextView charge = view.findViewById(R.id.tv_delivery_charge);
        RelativeLayout list = view.findViewById(R.id.rl_rest_list);

        logo.setImageResource(iv_company_logo[i]);
        name.setText(tv_company_name[i]);
        charge.setText(tv_delivery_charge[i] + "");

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MenuActivity.class);
                context.startActivity(intent);
            }
        });


        return view;
    }
}
