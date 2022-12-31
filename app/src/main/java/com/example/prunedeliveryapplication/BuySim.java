package com.example.prunedeliveryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prunedeliveryapplication.inventory.Data;

import java.util.ArrayList;


public class BuySim extends AppCompatActivity {

    Button paybttn;
   private Spinner spinnr_sim, quantity;
   private simAdapter adapter;
   ArrayList<Integer> number = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sim);
        spinnr_sim = findViewById(R.id.spinnr_sim);
        quantity = findViewById(R.id.quantity);
        paybttn = (Button) findViewById(R.id.paybttn);
        paybttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuySim.this, Payment.class);
                startActivity(intent);
            }
        });

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        ArrayAdapter<Integer> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, number);
        quantity.setAdapter(spinnerAdapter);

        adapter = new simAdapter(BuySim.this, Data.getsimList());
        spinnr_sim.setAdapter(adapter);



    }
}