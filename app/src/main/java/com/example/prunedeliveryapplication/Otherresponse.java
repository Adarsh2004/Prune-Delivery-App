package com.example.prunedeliveryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Otherresponse extends AppCompatActivity {
    Button saveResponse;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherresponse);
        Button button = (Button) findViewById(R.id.save_response);
        this.saveResponse = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Otherresponse.this.startActivity(new Intent(Otherresponse.this, get_orders.class));
            }
        });
    }
}