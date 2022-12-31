package com.example.prunedeliveryapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class get_orders extends AppCompatActivity {
    Button acceptbutt;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_orders);
        Button button =  findViewById(R.id.order_accept_but);
        this.acceptbutt = button;
        button.setOnClickListener(v -> get_orders.this.startActivity(new Intent(get_orders.this, customer_details.class)));
    }
}