package com.example.jadhav_o.stepcountconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetDetailsButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView1);
        TextView t2 = (TextView)findViewById(R.id.textView2);
        TextView t3 = (TextView)findViewById(R.id.textView3);
        float stepCount = Float.parseFloat(e1.getText().toString());

        float caloriesBurnt = stepCount/20;                 //Formula used : 20 steps = 1 calorie

        double kmsWalked = stepCount/1312.33595801;         //Formula used : 20 steps = 1 calorie
                                                            //Source : https://www.easycalculation.com/unit-conversion/steps-to-kilometer.php

        double milesWalked = kmsWalked * 0.621371;          //Formula used : 1 km = 0.621371 Mile

        double kmsTravelled = stepCount/1312.33595801;
        t1.setText( "Calories Burnt : " + Float.toString(caloriesBurnt));
        t2.setText( "Approximate Kilometers Walked : " + Double.toString(kmsWalked));
        t3.setText( "Approximate Miles Walked : " + Double.toString(milesWalked));
    }
}
