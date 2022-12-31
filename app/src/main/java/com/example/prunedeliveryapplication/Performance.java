package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Performance extends AppCompatActivity {


    private Spinner spinnr_performance;
    ArrayList<String> month = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
        spinnr_performance = findViewById(R.id.spinnr_performance);


        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

      ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, month);
        spinnr_performance.setAdapter(arrayAdapter);

    }
}