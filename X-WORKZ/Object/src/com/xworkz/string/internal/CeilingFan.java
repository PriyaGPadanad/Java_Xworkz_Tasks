package com.xworkz.string.internal;

public class CeilingFan {
    private String brand;
    private int speedLevels;
    private boolean remoteControl;

    public CeilingFan(String brand, int speedLevels, boolean remoteControl) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "CeilingFan [brand=" + brand + ", speedLevels=" + speedLevels + ", remoteControl=" + remoteControl + "]";
    }

    @Override
    public int hashCode() {
        return 4321;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CeilingFan) {
            CeilingFan other = (CeilingFan) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }
}


