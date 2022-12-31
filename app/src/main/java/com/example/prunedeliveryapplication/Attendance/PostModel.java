package com.example.prunedeliveryapplication.Attendance;

import com.google.gson.annotations.SerializedName;

public class PostModel {

    @SerializedName( "login_time")
    private String login_time;
    @SerializedName("logout_time")
    private String logout_time;
    @SerializedName("total_time")
    private String total_time;

    public PostModel(String login_time, String logout_time, String total_time) {
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.total_time = total_time;
    }

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }

    public String getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(String logout_time) {
        this.logout_time = logout_time;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }
}
