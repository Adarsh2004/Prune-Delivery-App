package com.example.prunedeliveryapplication.inventory;

import com.example.prunedeliveryapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<sim> getsimList() {
        List<sim> simList = new ArrayList<>();

        sim Airtel = new sim();
        Airtel.setName("Airtel");
        Airtel.setImage(R.drawable.airtel);
        simList.add(Airtel);

        sim VI = new sim();
        VI.setName("VI");
        VI.setImage(R.drawable.vi);
        simList.add(VI);

        sim Jio = new sim();
        Jio.setName("Jio");
        Jio.setImage(R.drawable.jio);
        simList.add(Jio);


        sim Bsnl = new sim();
        Bsnl.setName("Bsnl");
        Bsnl.setImage(R.drawable.bsnl);
        simList.add(Bsnl);

        return simList;
    }
}
