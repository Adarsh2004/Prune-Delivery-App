package com.example.prunedeliveryapplication.sendOtp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface apiset {
    @FormUrlEncoded
    @POST("account/getotp/")
    Call<responseModel> getregister(
            @Field("phone_number") String phone_number
    );

}
