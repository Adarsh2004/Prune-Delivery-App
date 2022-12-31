package com.example.prunedeliveryapplication.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {
    @POST("users/")
    Call<ResponseDefault> saveUser(@Body RequestDefault requestDefault);
}
