package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class card_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);
        getSupportActionBar().hide();
    }
}