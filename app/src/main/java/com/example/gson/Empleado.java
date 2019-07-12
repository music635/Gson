package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Empleado {

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("address")
    private Adress mAdsress;

    public Empleado(String mFirstName, int mAge, String mEmail, Adress mAddress) {
        mFirstName = mFirstName;
        mAge = mAge;
        mEmail = mEmail;
        mAddress = mAddress;
    }
}
