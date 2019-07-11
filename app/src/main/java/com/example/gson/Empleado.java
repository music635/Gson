package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Empleado {

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;

    public Empleado(String firstName, int age, String email) {

        mFirstName = firstName;
        mAge = age;
        mEmail = email;
    }
}
