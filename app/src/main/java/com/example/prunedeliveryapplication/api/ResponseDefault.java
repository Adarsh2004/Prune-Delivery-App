package com.example.prunedeliveryapplication.api;

public class ResponseDefault {
    private String name;
    private String dob;
    private String gender;
    private String aadhar_no;
    private String pincode;
    private String address;
    private String father_name;
    private String username;

    public ResponseDefault(String name, String dob, String gender, String aadhar_no, String pincode, String address, String father_name, String username) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.aadhar_no = aadhar_no;
        this.pincode = pincode;
        this.address = address;
        this.father_name = father_name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(String aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


