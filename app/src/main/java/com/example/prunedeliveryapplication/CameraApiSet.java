package com.example.prunedeliveryapplication;

import com.example.prunedeliveryapplication.api.ResponseDefault;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CameraApiSet {

    @FormUrlEncoded
    @POST("photo/")
    Call<BankDetailsResponseModel> getPicture(
            String bank_name, String account_no, String confirm_account_number, @Field("image") String image
    );

    Call<ResponseDefault> getdetails(String name, String fathername, String dob, String address, String state, String district, String pincode, String gender);
}
