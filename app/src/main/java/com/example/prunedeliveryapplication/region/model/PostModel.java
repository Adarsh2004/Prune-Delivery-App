package com.example.prunedeliveryapplication.region.model;

import com.google.gson.annotations.SerializedName;

public class PostModel {
    @SerializedName("address")
    private String address;

    public PostModel(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
