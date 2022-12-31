package com.example.prunedeliveryapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BankDetailsApiSet {
    @FormUrlEncoded
    @POST("bankdetail/")
    Call<BankDetailsResponseModel> getBankDetails (
            @Field("bank_name") String bank_name,
            @Field("account_no") String account_no,
            @Field(" confirm_account") String confirm_account,
            @Field("ifsc_code") String ifsc_code
    );

}
