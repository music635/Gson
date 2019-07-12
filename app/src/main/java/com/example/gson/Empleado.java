package com.example.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Empleado {

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Empleado(String firstName, int age, String email, Address address, List<FamilyMember> family) {
        mFirstName = firstName;
        mAge = age;
        mEmail = email;
        mAddress = address;
        mFamily = family;
    }
}
