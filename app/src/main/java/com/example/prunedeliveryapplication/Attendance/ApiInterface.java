package com.example.prunedeliveryapplication.Attendance;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("api/attendence/")
    Call<PostModel> postData(@Body PostModel postModel);
}
