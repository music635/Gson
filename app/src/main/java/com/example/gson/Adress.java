package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Adress {

    //Variables
    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    //Constructor
    public Adress(String mCountry, String mCity) {

        mCountry = mCountry;
        mCity = mCity;
    }
}
