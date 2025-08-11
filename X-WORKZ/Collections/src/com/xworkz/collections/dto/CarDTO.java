package com.xworkz.collections.dto;

import java.io.Serializable;

public class CarDTO implements Serializable {
    private String brand;
    private String model;
    private String fuelType;
    private int price;
    private String color;
    private int mileage;
    private boolean automatic;

    public CarDTO(String brand,String model,String fuelType,int price,String color,int mileage,boolean automatic){
        this.brand=brand;
        this.model=model;
        this.fuelType=fuelType;
        this.price=price;
        this.color=color;
        this.mileage=mileage;
        this.automatic=automatic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", automatic=" + automatic +
                '}';
    }
}
