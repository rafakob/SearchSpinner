package com.rafakob.searchspinner.example;

import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("id")
    public int id;
    @SerializedName("first_name")
    public String firstName;
    @SerializedName("last_name")
    public String lastName;
    @SerializedName("email")
    public String email;
    @SerializedName("gender")
    public String gender;
    @SerializedName("country")
    public String country;
}
