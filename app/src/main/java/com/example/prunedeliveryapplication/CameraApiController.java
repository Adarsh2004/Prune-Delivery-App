package com.example.prunedeliveryapplication;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CameraApiController {

    private static final String url = "http://127.0.0.1:8000/api/";
    private static CameraApiController clientobject;
    private static Retrofit retrofit;

    CameraApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized CameraApiController getInstance() {
        if (clientobject == null)
            clientobject = new CameraApiController();
        return clientobject;
    }

    CameraApiSet getapi()
    {
       return retrofit.create(CameraApiSet.class);
    }
}
