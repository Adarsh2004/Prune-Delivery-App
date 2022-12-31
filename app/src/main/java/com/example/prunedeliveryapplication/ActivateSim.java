package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class ActivateSim extends AppCompatActivity {

    Spinner spinnr_paymntmode;
    ArrayList<String> pm = new ArrayList<>();
    Button Proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate_sim);
        spinnr_paymntmode = findViewById(R.id.spinnr_paymntmode);
        Proceed = (Button) findViewById(R.id.Proceed);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivateSim.this,simstock.class);
                startActivity(intent);
            }
        });

        pm.add("Cash");
        pm.add("QR Code");
        pm.add("Online");

        ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, pm);
        spinnr_paymntmode.setAdapter(arrayAdapter);



    }
}