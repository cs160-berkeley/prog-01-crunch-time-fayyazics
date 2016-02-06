package com.example.fayyazmukarram.prog01;

import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;



public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    public static int activity = 0;
    public static float calories = 0;

    public static float reps = 0;
    public static List<String> events = new ArrayList<>();

    public static String activity0 = "0";
    public static String activity1 = "0";
    public static String activity2 = "0";
    public static String activity3 = "0";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Spinner Element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        events.add("pushups");
        events.add("situps");
        events.add("jumping jacks");
        events.add("jogging");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, events);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        //Edit Text

        EditText et = (EditText) findViewById(R.id.reps);
        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;

                if(actionId == EditorInfo.IME_ACTION_DONE){

                    ///Make it work
                    EditText et = (EditText) findViewById(R.id.reps);
                    reps = Integer.parseInt(et.getText().toString());

                    calc();

                    ///take me to next page
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);

                }
                return handled;
            }
        });
    }

    public void calc(){

        if (activity == 0){
            calories = (reps * 100) / 350;

        } else if (activity == 1){

            calories = (reps * 100) / 200;

        }   else if (activity == 2){
            calories = (reps * 100) / 10;

        }   else if (activity == 3){
            calories = (reps * 100) / 12;

        }   else {

            System.out.println("you messed up");

        }


        setActivities();


    }

    public void setActivities(){

        activity0 = Math.round(calories * 3.5) + "";
        activity1 = Math.round(calories * 2.0) + "";
        activity2 = Math.round(calories * 0.1) + "";
        activity3 = Math.round(calories * 0.12) + "";
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        activity = position;
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
