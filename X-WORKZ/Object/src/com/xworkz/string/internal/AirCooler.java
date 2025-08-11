package com.xworkz.string.internal;

import java.util.Objects;

public class AirCooler {
    private String brand;
    private int tankCapacity;
    private boolean hasRemote;

    public AirCooler(String brand, int tankCapacity, boolean hasRemote) {
        this.brand = brand;
        this.tankCapacity = tankCapacity;
        this.hasRemote = hasRemote;
    }

    @Override
    public String toString() {
        return "AirCooler [brand=" + brand + ", tankCapacity=" + tankCapacity + "L, remote=" + hasRemote + "]";
    }



    @Override
    public int hashCode() {
        return Objects.hash(brand, tankCapacity, hasRemote);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AirCooler) {
            AirCooler other = (AirCooler) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }
}



