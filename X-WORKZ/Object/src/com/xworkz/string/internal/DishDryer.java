package com.xworkz.string.internal;

public class DishDryer {
    private String brand;
    private int capacityPlates;
    private boolean hasHeater;

    public DishDryer(String brand, int capacityPlates, boolean hasHeater) {
        this.brand = brand;
        this.capacityPlates = capacityPlates;
        this.hasHeater = hasHeater;
    }

    @Override
    public String toString() {
        return "DishDryer [brand=" + brand + ", capacity=" + capacityPlates + " plates, heater=" + hasHeater + "]";
    }

        @Override
        public int hashCode(){
            return 8690;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DishDryer) {
            DishDryer other = (DishDryer) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }

}


