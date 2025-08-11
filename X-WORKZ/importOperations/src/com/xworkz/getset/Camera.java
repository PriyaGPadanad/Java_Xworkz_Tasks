package com.xworkz.getset;

public class Camera {
    private String brand;
    private double price;
    private CameraType type;
    private String connectivity;

    public Camera(String brand, double price, CameraType type, String connectivity) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.connectivity = connectivity;
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

    public CameraType getType() {
        return type;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }
}
