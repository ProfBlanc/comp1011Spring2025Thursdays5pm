package com.example.comp1011spring2025thursdays5pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CameraModel {

    /*
        lens: String
        color: String
        iso: double
        make: from a list of options
        model: String
        int resolution

     */
    private String lens = "lens";
    private String color = "black";
    private double iso = 100;
    private int resolution = 1080;
    private String model = "base";
    enum Companies {SONY, NIKON, CANON, FUJIFILM}
    private Companies make = Companies.SONY;

    /*
        Create the getters and setters for each instance variable
        For all instance variables except make, add restrictions
            throw an IllegalArgumentException if the value is not valid
        Create 2 constructors: default + 6-arg constructor
        Bonus: create a method named: getAllCompanies -> returns a list of all companies as String data type

     */

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {

        if(lens.length() < 3 || lens.length() > 10)
            throw new IllegalArgumentException("Lens length must be between 3 and 10 characters");

        this.lens = lens;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(!Arrays.asList("red,white,blue,black".split(",")).contains(color.toLowerCase()))
            throw new IllegalArgumentException("Invalid color");

        this.color = color;
    }

    public double getIso() {
        return iso;
    }

    public void setIso(double iso) {
        if(iso < 100 || iso > 1000)
            throw new IllegalArgumentException("ISO must be between 100 and 1000");
        this.iso = iso;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {

        if(resolution < 1080 || resolution > 15000)
            throw new IllegalArgumentException("Resolution must be between 1080 and 15000");
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() < 3)
            throw new IllegalArgumentException("Model must be at least 3 characters long");
        this.model = model;
    }

    public Companies getMake() {
        return make;
    }

    public void setMake(Companies make) {
        this.make = make;
    }

    public CameraModel(){}
    public CameraModel(String lens, String color, double iso, int resolution, String model, Companies make) {

        setLens(lens);
        setColor(color);
        setIso(iso);
        setResolution(resolution);
        setModel(model);
        setMake(make);
    }

    public String toString(){

        return String.format("%s %s %s", color, make, model);
    }


}
