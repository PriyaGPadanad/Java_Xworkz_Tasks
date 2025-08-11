package com.xworkz.string.internal;

public class Chocolate {
    private String type; // Dark, Milk, White
    private String brand;
    private boolean hasNuts;

    public Chocolate(String type, String brand, boolean hasNuts) {
        this.type = type;
        this.brand = brand;
        this.hasNuts = hasNuts;
    }

    @Override
    public String toString() {
        return "Chocolate [type=" + type + ", brand=" + brand + ", hasNuts=" + hasNuts + "]";
    }

        @Override
        public int hashCode(){
            return 1122;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chocolate) {
            Chocolate other = (Chocolate) obj;
            return this.type.equals(other.type);
        }
        return false;
    }

}


