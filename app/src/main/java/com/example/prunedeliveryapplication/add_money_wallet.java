package com.example.prunedeliveryapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class add_money_wallet extends AppCompatActivity {
    Button addmoney;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_money_wallet);
        getSupportActionBar().hide();
        Button button = findViewById(R.id.add_money);
        this.addmoney = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                add_money_wallet.this.startActivity(new Intent(add_money_wallet.this, card_option.class));
            }
        });
    }

}