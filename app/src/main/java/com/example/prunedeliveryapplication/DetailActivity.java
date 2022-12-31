package com.example.prunedeliveryapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView Status, id, Type, date, Amount_Paid;
    Button Pay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ActionBar actionBar = getSupportActionBar();


        Status = findViewById(R.id.Status);
        id = findViewById(R.id.id);
        Pay = findViewById(R.id.Pay);
        Type = findViewById(R.id.type);
        date = findViewById(R.id.date);
        Amount_Paid = findViewById(R.id.Amount_Paid);

        Intent intent = getIntent();
        String iD = intent.getStringExtra("iID");
        String TYPE = intent.getStringExtra("type");
        String Date = intent.getStringExtra("date");
        String AmountPaid = intent.getStringExtra("amount");
        String status = intent.getStringExtra("status");
        byte[] mBytes = getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);
        id.setText(iD);
        Type.setText(TYPE);
        date.setText(Date);
        Amount_Paid.setText(AmountPaid);
        Status.setText(status);





    }
}