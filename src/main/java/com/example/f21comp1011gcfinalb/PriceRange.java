package com.example.f21comp1011gcfinalb;

import java.net.PortUnreachableException;

public class PriceRange {

    private double minPrice;
    private double maxPrice;

    public PriceRange(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        if (minPrice >0) {
            this.minPrice = minPrice;
        }
        else
        {
            throw new IllegalArgumentException(minPrice + "MUST BE GRATER THAN 0");
        }

    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        if (maxPrice >= minPrice ) {
            this.maxPrice = maxPrice;
        }
        else
        {
            throw new IllegalArgumentException(maxPrice + "MUST BE GRATER THAN OR EQUAL TO MINIMUM PRICE");
        }
    }

    public String toString() {
        return String.format("$%.0f to $%.0f",minPrice,maxPrice);
    }

}
