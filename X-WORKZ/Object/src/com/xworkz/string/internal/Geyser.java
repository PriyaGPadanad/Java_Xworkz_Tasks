package com.xworkz.string.internal;

public class Geyser {
    private String brand;
    private int capacity;
    private boolean instantHeat;

    public Geyser(String brand, int capacity, boolean instantHeat) {
        this.brand = brand;
        this.capacity = capacity;
        this.instantHeat = instantHeat;
    }

    @Override
    public String toString() {
        return "Geyser [brand=" + brand + ", capacity=" + capacity + "L, instant=" + instantHeat + "]";
    }

        @Override
        public int hashCode(){
            return 99789;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Geyser) {
                Geyser other = (Geyser) obj;
                return this.brand.equals(other.brand) && this.capacity==other.capacity;
            }
            return false;
        }

    }


