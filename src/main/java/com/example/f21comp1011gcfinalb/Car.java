package com.example.f21comp1011gcfinalb;

import com.google.gson.annotations.SerializedName;

public class Car {
    public Car(int stockNum, int year, String brand, double price, String model, String type) {
        this.stockNum = stockNum;
        this.year = year;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.type = type;
    }

    @SerializedName("StockNum")
    private int stockNum;

    @SerializedName("year")
    private int year;

    @SerializedName("Brand")
    private String brand;

    @SerializedName("price")
    private double price;

    @SerializedName("Model")
    private String model;

    @SerializedName("type")
    private String type;

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String toString() {
        return String.format("%d - %s %s - $%.2f -type(s): %s", year, brand, model, price, type);
    }

    public static void main(String[] args) {
        Car  car = new Car(12,2020,"BMW",123.12,"x6","suv");
        System.out.println(car);
    }

}
