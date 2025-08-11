package com.xworkz.getset;

public class IdCard {
    private String material;
    private String[] colors;
    private double weight;
    private String designedBy;

    public IdCard(String material, String[] colors, double weight, String designedBy) {
        this.material = material;
        this.colors = colors;
        this.weight = weight;
        this.designedBy = designedBy;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDesignedBy() {
        return designedBy;
    }

    public void setDesignedBy(String designedBy) {
        this.designedBy = designedBy;
    }
}
