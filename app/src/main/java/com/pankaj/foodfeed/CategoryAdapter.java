package com.pankaj.foodfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private Integer[] cat_icon;
    private String[] cat_name;

    public CategoryAdapter(Context c, Integer[] cat_icon, String[] cat_name) {
        context = c;
        this.cat_icon = cat_icon;
        this.cat_name = cat_name;
    }

    @Override

    public int getCount() {
        return cat_icon.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null) {
            view = inflater.inflate(R.layout.categories, null);
        }

        ImageView imageview = view.findViewById(R.id.cat_icon);
        TextView textView = view.findViewById(R.id.cat_name);

        imageview.setImageResource(cat_icon[i]);
        textView.setText(cat_name[i]);

        return view;
    }
}
