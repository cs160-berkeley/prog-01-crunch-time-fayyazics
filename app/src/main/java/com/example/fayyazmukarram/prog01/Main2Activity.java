package com.example.fayyazmukarram.prog01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (MainActivity.events.get(MainActivity.activity) == "pushups") {
            new AlertDialog.Builder(Main2Activity.this)
                    .setTitle(" " + Math.round(MainActivity.reps) + " reps of " + MainActivity.events.get(MainActivity.activity) + ":")
                    .setMessage(Math.round(MainActivity.calories) + " calories burned")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(R.drawable.cat)
                    .show();

        } else if (MainActivity.events.get(MainActivity.activity) == "situps") {
            new AlertDialog.Builder(Main2Activity.this)
                    .setTitle(" " + Math.round(MainActivity.reps) + " reps of " + MainActivity.events.get(MainActivity.activity) + ":")
                    .setMessage(Math.round(MainActivity.calories) + " calories burned")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(R.drawable.cat)
                    .show();

        } else if (MainActivity.events.get(MainActivity.activity) == "jumping jacks") {
            new AlertDialog.Builder(Main2Activity.this)
                    .setTitle(" " + Math.round(MainActivity.reps) + " minutes of " + MainActivity.events.get(MainActivity.activity) + ":")
                    .setMessage(Math.round(MainActivity.calories) + " calories burned")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(R.drawable.cat)
                    .show();

        } else if (MainActivity.events.get(MainActivity.activity) == "jogging") {
            new AlertDialog.Builder(Main2Activity.this)
                    .setTitle(" " + Math.round(MainActivity.reps) + " minutes of " + MainActivity.events.get(MainActivity.activity) + ":")
                    .setMessage(Math.round(MainActivity.calories) + " calories burned")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(R.drawable.cat)
                    .show();

        } else {
            System.out.println("you did something wrong");
        }

        GridView gv = (GridView) findViewById(R.id.gv);
        gv.setAdapter(new CustomGridAdapter(Main2Activity.this));
        gv.setAdapter(new CustomGridAdapter(Main2Activity.this));
    }

}
