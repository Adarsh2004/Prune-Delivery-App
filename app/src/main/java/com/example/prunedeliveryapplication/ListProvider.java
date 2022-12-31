package com.example.prunedeliveryapplication;

public class ListProvider  {
    private String sim_number, mobile_number;

    public ListProvider(String sim_number, String mobile_number){

        this.setSim_number(sim_number);
        this.setMobile_number(mobile_number);

    }

    public String getSim_number() {
        return sim_number;
    }

    public void setSim_number(String sim_number) {
        this.sim_number = sim_number;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}
