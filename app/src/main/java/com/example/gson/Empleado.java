package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Empleado {

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("adress")
    private Adress mAdress;

    public Empleado(String firstName, int age, String email, Adress adress) {

        mFirstName = firstName;
        mAge = age;
        mEmail = email;
        mAdress = adress;
    }
}
