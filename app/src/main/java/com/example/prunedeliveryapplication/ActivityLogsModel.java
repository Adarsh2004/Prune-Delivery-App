package com.example.prunedeliveryapplication;

public class ActivityLogsModel {

    private String Transaction_ID, Type, Date, Amount, Completed;
    private int img;

    public String getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(String transaction_ID) {
        Transaction_ID = transaction_ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getCompleted() {
        return Completed;
    }

    public void setCompleted(String completed) {
        Completed = completed;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
