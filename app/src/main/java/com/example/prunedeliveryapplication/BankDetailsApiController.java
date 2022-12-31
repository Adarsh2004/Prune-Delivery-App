package com.example.prunedeliveryapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BankDetailsApiController
{

    private static final String url = "http://127.0.0.1:8000/api/";
    private static BankDetailsApiController clientobject;
    private static Retrofit retrofit;

    BankDetailsApiController()
    {

        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized BankDetailsApiController getInstance()
    {
        if (clientobject== null)
            clientobject = new BankDetailsApiController();
        return clientobject;
    }

    CameraApiSet getApi()
    {
        return retrofit.create(CameraApiSet.class);
    }
}
