package com.example.prunedeliveryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class card_option extends AppCompatActivity {
    Button creditbut;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_option);
        getSupportActionBar().hide();
        Button button =  findViewById(R.id.credit_butt);
        this.creditbut = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                card_option.this.startActivity(new Intent(card_option.this, card_detail.class));
            }
        });
    }
}