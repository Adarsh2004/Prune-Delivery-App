package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class personal_details_screen extends AppCompatActivity {
    CardView subv1,sub_verify2,sub_verify3,sub_verify4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details_screen);
        this.subv1 = findViewById(R.id.sub_verify1);
        this.sub_verify2 = findViewById(R.id.sub_verify2);
        this.sub_verify3 = findViewById(R.id.sub_verify3);
        this.sub_verify4 = findViewById(R.id.sub_verify4);
        subv1.setOnClickListener(view -> {
            Intent intent = new Intent(personal_details_screen.this, personal_details.class);
            startActivity(intent);
        });
        sub_verify2.setOnClickListener(view -> {
            Intent intent = new Intent(personal_details_screen.this, IdentityDetails.class);
            startActivity(intent);
        });

        sub_verify3.setOnClickListener(view -> {
            Intent intent = new Intent(personal_details_screen.this, driving_license.class);
            startActivity(intent);
        });
        sub_verify4.setOnClickListener(view -> {
            Intent intent = new Intent(personal_details_screen.this, bank_details.class);
            startActivity(intent);
        });
    }
}