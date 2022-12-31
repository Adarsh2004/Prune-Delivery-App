package com.example.prunedeliveryapplication.tShirt;

import com.example.prunedeliveryapplication.tShirt.model.tShirtPostModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterfacetShirt {

    @POST("/api/tshirt/")
    Call<tShirtPostModel> PostData(@Body tShirtPostModel tShirtPostModel);


}
