package com.xworkz.string.internal;

public class ElectricKettle {
    private String brand;
    private double capacity;
    private boolean autoShutOff;

    public ElectricKettle(String brand, double capacity, boolean autoShutOff) {
        this.brand = brand;
        this.capacity = capacity;
        this.autoShutOff = autoShutOff;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", capacity=" + capacity + "L, autoShutOff=" + autoShutOff + "]";
    }

        @Override
        public int hashCode(){
            return 96675;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElectricKettle) {
            ElectricKettle other = (ElectricKettle) obj;
            return this.brand.equals(other.brand) && this.capacity==other.capacity;
        }
        return false;
    }

    }

