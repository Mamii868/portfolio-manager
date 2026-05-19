package com.pluralsight;

public class House extends FixedAsset {
    private int year;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int year, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.year = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
}