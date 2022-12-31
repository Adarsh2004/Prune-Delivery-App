package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class SendOTPActivity extends AppCompatActivity {


    EditText t1;
    Button b1,d1;
    EditText t2;


    CountryCodePicker ccp;
    ProgressBar progressBar;
    ProgressDialog progressDialog;
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_o_t_p);


        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        b1 = findViewById(R.id.b1);
        d1 = findViewById(R.id.d1);
        ccp = findViewById(R.id.ccp);
        progressDialog = new ProgressDialog(this);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        final ProgressBar progressBar = findViewById(R.id.progressBar);

        b1.setOnClickListener((View v) -> {
            Intent intent = new Intent(SendOTPActivity.this, compl_verify.class);
            startActivity(intent);
            try {
                String apiKey = "apiKey=" + "";
                Random random = new Random();
                randomNumber = random.nextInt(999999);
                String message = "&message="+"hey your OTP is"+randomNumber;
                String sender ="&sender="+"bb";
                String number ="&numbers=" +t1.getText().toString();
                HttpURLConnection xyz = (HttpURLConnection) new URL("http://192.168.1.22:1000/api/accounts/register/get_otp/").openConnection();
                String data = apiKey + randomNumber;
                xyz.setDoOutput(true);
                xyz.setRequestMethod("POST");
                xyz.setRequestProperty("Content-Length", Integer.toString(data.length()));
                xyz.getOutputStream().write(data.getBytes("UTF-8"));
                final BufferedReader rd = new BufferedReader((new BufferedReader(new InputStreamReader(xyz.getInputStream()))));
                final StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = rd.readLine()) != null) {
                    stringBuffer.append(line);
                }
                rd.close();

                Toast.makeText(getApplicationContext(), "OTP SEND SUCCESSFULLY", Toast.LENGTH_LONG).show();



            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "ERROR SMS " + e, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "ERROR " + e, Toast.LENGTH_LONG).show();

            }


        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomNumber == Integer.valueOf(t2.getText().toString()))
                    Toast.makeText(getApplicationContext(), "you are loged in successfully", Toast.LENGTH_LONG).show();

            }
        });
    }
}