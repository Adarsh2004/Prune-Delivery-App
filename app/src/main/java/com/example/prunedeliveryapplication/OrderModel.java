package com.example.prunedeliveryapplication;

import android.widget.Button;

import org.checkerframework.checker.units.qual.C;

public class OrderModel {
    int img1 ,img2;
    String   order_id, area_id, address_id, time_slot_id,Order_Type_id, location_text;


    public OrderModel(int img1, int img2, String order_id, String area_id, String address_id, String time_slot_id, String order_Type_id, String location_text) {

        this.img1 = img1;
        this.img2 = img2;
        this.order_id = order_id;
        this.area_id= area_id;
        this.address_id = address_id;
        this.time_slot_id = time_slot_id;
        this.Order_Type_id = order_Type_id;
        this.location_text = location_text;
    }
}
