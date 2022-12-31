package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Payment extends AppCompatActivity {

    TextView mod;
    RadioGroup radiogrp;
    RadioButton radio_1, radio_2, radio_3;
    Button proceedbttn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        mod = (TextView) findViewById(R.id.mod);
        radiogrp = (RadioGroup) findViewById(R.id.radiogrp);
        radio_1 = (RadioButton) findViewById(R.id.radio_1);
        radio_2 = (RadioButton) findViewById(R.id.radio_2);
        radio_3 = (RadioButton) findViewById(R.id.radio_3);
        proceedbttn = (Button) findViewById(R.id.proceedbttn);
        proceedbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, ActivateSim.class);
                startActivity(intent);
            }
        });
    }

    public void checkButton(View v){

    }
}