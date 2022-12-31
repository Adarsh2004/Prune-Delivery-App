package com.example.prunedeliveryapplication.tShirt.model;

import com.google.gson.annotations.SerializedName;

public class tShirtPostModel {
    @SerializedName("size")
    private String size;

    public tShirtPostModel(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
