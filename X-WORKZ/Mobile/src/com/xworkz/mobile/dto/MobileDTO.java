package com.xworkz.mobile.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
    private int mobileId;
    private String brand;
    private String model;
    private String operatingSystem;
    private int ramSize;
    private int storageCapacity;
    private double price;
    private float rating;

    public MobileDTO(int mobileId,String brand,String model,String operatingSystem,int ramSize,int storageCapacity,double price,float rating){
        this.mobileId=mobileId;
        this.brand=brand;
        this.model=model;
        this.operatingSystem=operatingSystem;
        this.ramSize=ramSize;
        this.storageCapacity=storageCapacity;
        this.price=price;
        this.rating=rating;

    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MobileDTO{" +
                "mobileId=" + mobileId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ramSize=" + ramSize +
                ", storageCapacity=" + storageCapacity +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
