package com.xworkz.iterator.dto;

import java.io.Serializable;

public class PerfumeDTO implements Serializable {
    private String name;
    private String brand;
    private String type;
    private double price;
    private String fragrance;
    private int quantityInMl;
    private String color;
    private String country;
    private boolean unisex;
    private String expiryDate;

    public PerfumeDTO(String name,String brand,String type,double price,String fragrance,int quantityInMl,String color,String country,boolean unisex,String expiryDate){
        this.name=name;
        this.brand=brand;
        this.type=type;
        this.fragrance=fragrance;
        this.quantityInMl=quantityInMl;
        this.color=color;
        this.country=country;
        this.unisex=unisex;
        this.expiryDate=expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public int getQuantityInMl() {
        return quantityInMl;
    }

    public void setQuantityInMl(int quantityInMl) {
        this.quantityInMl = quantityInMl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isUnisex() {
        return unisex;
    }

    public void setUnisex(boolean unisex) {
        this.unisex = unisex;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PerfumeDTO{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", fragrance='" + fragrance + '\'' +
                ", quantityInMl=" + quantityInMl +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", unisex=" + unisex +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
