package com.example.f21comp1011gcfinalb;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Dealership {

    @SerializedName("Dealer")
    private String dealer;

    @SerializedName("CarsReturned")
    private int carReturned;

    @SerializedName("Stock")
    private ArrayList<Car> stock;

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public int getCarReturned() {
        return carReturned;
    }

    public void setCarReturned(int carReturned) {
        this.carReturned = carReturned;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }


}
