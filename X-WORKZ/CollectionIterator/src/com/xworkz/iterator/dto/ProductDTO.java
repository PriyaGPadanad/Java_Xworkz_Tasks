package com.xworkz.iterator.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private String name;
    private String brand;
    private String category;
    private double price;
    private double discount;
    private int stock;
    private String color;
    private String expiryDate;
    private int warranty;
    private boolean available;

    public ProductDTO(String name, String brand, String category, double price, double discount, int stock, String color, String expiryDate, int warranty, boolean available) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.color = color;
        this.expiryDate = expiryDate;
        this.warranty = warranty;
        this.available = available;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", stock=" + stock +
                ", color='" + color + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", warranty=" + warranty +
                ", available=" + available +
                '}';
    }
}
