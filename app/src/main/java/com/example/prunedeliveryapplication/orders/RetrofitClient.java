package com.example.prunedeliveryapplication.orders;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private String BASE_URL = "http://127.0.0.1:8000/api/";
    private Retrofit retrofit;
    private static RetrofitClient retrofitClient;

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private static synchronized RetrofitClient getInstance() {
        if (retrofitClient == null) {
            retrofitClient = new RetrofitClient();

        }

        return retrofitClient;
    }
}
