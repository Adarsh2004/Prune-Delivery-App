package com.example.prunedeliveryapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class customer_details extends AppCompatActivity {
    RadioButton deliverlater;
    RadioButton delivernow;
    RadioButton other;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
        this.deliverlater =  findViewById(R.id.deliver_later_but);
        this.delivernow =  findViewById(R.id.deliver_now_but);
        RadioButton radioButton =  findViewById(R.id.other_but);
        this.other = radioButton;
        radioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customer_details.this.startActivity(new Intent(customer_details.this, Otherresponse.class));
            }
        });
        this.delivernow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customer_details.this.startActivity(new Intent(customer_details.this, TimeView.class));
            }
        });
        this.deliverlater.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                customer_details.this.startActivity(new Intent(customer_details.this, calender_view.class));
            }
        });
    }
}