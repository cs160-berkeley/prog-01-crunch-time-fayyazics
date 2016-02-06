package com.example.fayyazmukarram.prog01;


import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


/**
 * Created by fayyazmukarram on 2/4/16.
 */
public class CustomGridAdapter extends BaseAdapter {

    Context ctx;
    String items[] = {"Pushup", "Situp", "Jumping Jacks", "Jogging"};

    public CustomGridAdapter(Context c) {
        ctx = c;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView et = new TextView(ctx);

        if (position == 0) {
            et.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.pushup, 0, 0);
            String temp = MainActivity.activity0 + " reps of pushups";
            et.setText(temp);

        } else if (position == 1) {
            et.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.situp, 0, 0);
            String temp = MainActivity.activity1 + " reps of situps";
            et.setText(temp);


        } else if (position == 2) {
            et.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.jumpingjack, 0, 0);
            String temp = MainActivity.activity2 + " minutes of jumping jacks";
            et.setText(temp);

        } else if (position == 3) {
            et.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.jogging, 0, 0);
            String temp = MainActivity.activity3 + " minutes of jogging";
            et.setText(temp);
        }


        DisplayMetrics metrics = ctx.getResources().getDisplayMetrics();
        int width = metrics.widthPixels / 3;
        int height = metrics.heightPixels / 3;
        et.setLayoutParams(new GridView.LayoutParams(width, height));

        et.setGravity(Gravity.CENTER);


        return et;
    }

}