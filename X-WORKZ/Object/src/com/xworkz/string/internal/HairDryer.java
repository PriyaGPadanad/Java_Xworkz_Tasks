package com.xworkz.string.internal;

public class HairDryer {
    private String brand;
    private int heatSettings;
    private boolean coolShotAvailable;

    public HairDryer(String brand, int heatSettings, boolean coolShotAvailable) {
        this.brand = brand;
        this.heatSettings = heatSettings;
        this.coolShotAvailable = coolShotAvailable;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", heatSettings=" + heatSettings + ", coolShot=" + coolShotAvailable + "]";
    }

    @Override
    public int hashCode() {
        return 8664;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HairDryer) {
            HairDryer other = (HairDryer) obj;
            return this.brand.equals(other.brand) &&
                    this.heatSettings == other.heatSettings;
        }
        return false;
    }
}


