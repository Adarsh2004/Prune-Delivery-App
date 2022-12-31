package com.example.prunedeliveryapplication.region;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static final String Baseurl = "http://127.0.0.1:8000/";

    public static Retrofit getRetrofit(){
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Baseurl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
