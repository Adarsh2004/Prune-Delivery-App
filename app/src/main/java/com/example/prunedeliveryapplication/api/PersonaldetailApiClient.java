package com.example.prunedeliveryapplication.api;

import com.example.prunedeliveryapplication.BankDetailsApiController;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PersonaldetailApiClient {

    private static Retrofit getRetrofit(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl("http://192.168.1.2:1000/api/aadhardetails/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit;
    }
    public static UserService getUserService(){
        UserService userService=getRetrofit().create(UserService.class);
        return userService;
    }
    public static BankDetailsApiController getInstance() {
        return null;
    }
}