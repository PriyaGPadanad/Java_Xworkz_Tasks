package com.xworkz.collections.dto;

public class MobileDTO {
    private String brand;
    private String model;
    private int price;
    private String color;
    private String processsor;
    private int ram;
    private boolean is5G;

    public MobileDTO(String brand,String model,int price,String color,String processsor,int ram,boolean is5G){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.color=color;
        this.processsor=processsor;
        this.ram=ram;
        this.is5G=is5G;
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

    public String getProcesssor() {
        return processsor;
    }

    public void setProcesssor(String processsor) {
        this.processsor = processsor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isIs5G() {
        return is5G;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "MobileDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", processsor='" + processsor + '\'' +
                ", ram=" + ram +
                ", is5G=" + is5G +
                '}';
    }
}
