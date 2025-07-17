package com.example.comp1011spring2025thursdays5pm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person {

    @Expose
    public String name;

    private int age;

    @Expose
    @SerializedName("screen_name")
    public String nickname;

    protected double weight;

    @Expose
    public double height;

}
