package com.xworkz.string.internal;

public class CoffeeMaker {
    private String brand;
    private int cupCapacity;
    private boolean autoBrew;

    public CoffeeMaker(String brand, int cupCapacity, boolean autoBrew) {
        this.brand = brand;
        this.cupCapacity = cupCapacity;
        this.autoBrew = autoBrew;
    }

    @Override
    public String toString() {
        return "CoffeeMaker [brand=" + brand + ", cupCapacity=" + cupCapacity + ", autoBrew=" + autoBrew + "]";
    }

        @Override
        public int hashCode(){
            return 9999;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CoffeeMaker) {
            CoffeeMaker other = (CoffeeMaker) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }

}


