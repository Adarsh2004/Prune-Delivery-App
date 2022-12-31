package com.example.prunedeliveryapplication.region;

import com.example.prunedeliveryapplication.region.model.PostModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("api/region/")
    Call<PostModel> postData(@Body PostModel postModel);
}
