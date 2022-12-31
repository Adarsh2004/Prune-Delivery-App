package com.example.prunedeliveryapplication.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface Api {
    @POST("/api/getdetails")
    Call<ResponseDefault> getdetails(
            @Field("name") String name,
            @Field("father_name") String father_name,
            @Field("dob") String dob,
            @Field("gender") String gender,
            @Field("address") String address,
            @Field("district") String district,
            @Field("state") String state,
            @Field("pincode") String pincode
    );
}
