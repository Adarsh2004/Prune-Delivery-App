package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.prunedeliveryapplication.inventory.Data;

import java.util.ArrayList;

public class simstock extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ListProvider> arrayList = new ArrayList<ListProvider>();
    String [] sim_number, mobile_number;
    private Spinner spinnr_simstock,spinnr_stock;
    ArrayList<String> list = new ArrayList<>();
    private simAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simstock);
        spinnr_simstock = findViewById(R.id.spinnr_simstock);
        spinnr_stock = findViewById(R.id.spinnr_stock);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        list.add("Pre Burnt Sim");
        list.add("Blank Sim");

        ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        spinnr_simstock.setAdapter(arrayAdapter);

        adap = new simAdapter(simstock.this, Data.getsimList());
        spinnr_stock.setAdapter(adap);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        sim_number = getResources().getStringArray(R.array.Sim_Number);
        mobile_number = getResources().getStringArray(R.array.Mobile_Number);
        int count = 0;
        for(String SIM_NUMBER : sim_number)
        {
            ListProvider listProvider = new ListProvider(SIM_NUMBER,mobile_number[count]);
            arrayList.add(listProvider);
            count++;
        }

        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
}