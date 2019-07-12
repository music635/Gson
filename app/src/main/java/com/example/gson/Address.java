package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Address {

    //Variables
    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    //Constructor
    public Address(String mCountry, String mCity) {

        mCountry = mCountry;
        mCity = mCity;
    }
}
