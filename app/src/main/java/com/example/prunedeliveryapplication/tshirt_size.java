package com.example.prunedeliveryapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prunedeliveryapplication.tShirt.ApiInterfacetShirt;
import com.example.prunedeliveryapplication.tShirt.RetrofitClient;
import com.example.prunedeliveryapplication.tShirt.model.tShirtPostModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class tshirt_size extends AppCompatActivity {

    Button t_shirt_continue;
    RadioButton but_size1, but_size2, but_size3, but_size4, but_size5, but_size6;
    RadioGroup tshirt;

    private ProgressDialog progressDialog;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt_size);

        but_size1 = findViewById(R.id.but_size1);
        but_size2 = findViewById(R.id.but_size2);
        but_size3 = findViewById(R.id.but_size3);
        but_size4 = findViewById(R.id.but_size4);
        but_size5 = findViewById(R.id.but_size5);
        but_size6 = findViewById(R.id.but_size6);
        progressDialog = new ProgressDialog(this);
        t_shirt_continue = findViewById(R.id.t_shirt_continue);
        t_shirt_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* sendData();*/

            }
        });

    }

    /*private void sendData() {
        progressDialog.setMessage("Post Data in Progress...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        ApiInterfacetShirt apiInterfacetShirt = RetrofitClient.getRetrofit().create(ApiInterfacetShirt.class);
        final tShirtPostModel tShirtPostModel = new tShirtPostModel();
        Call<tShirtPostModel> call = apiInterfacetShirt.PostData(tShirtPostModel);

        call.enqueue(new Callback<tShirtPostModel>() {
            @Override
            public void onResponse(Call<tShirtPostModel> call, Response<tShirtPostModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful())
                {
                    Toast.makeText(tshirt_size.this, "Select tShirt size", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(tshirt_size.this, "Select tShirt size", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<tShirtPostModel> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(tshirt_size.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }*/


}