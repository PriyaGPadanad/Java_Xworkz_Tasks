package com.xworkz.string.internal;

public class LunchBox {
    private String brand;
    private int compartments;
    private boolean isMicrowaveSafe;

    public LunchBox(String brand, int compartments, boolean isMicrowaveSafe) {
        this.brand = brand;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox [brand=" + brand + ", compartments=" + compartments + ", microwaveSafe=" + isMicrowaveSafe + "]";
    }

        @Override
        public int hashCode(){
            return 5452;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof LunchBox){
            LunchBox other=(LunchBox)obj;
            return this.brand.equals(other.brand)&& this.isMicrowaveSafe==other.isMicrowaveSafe;
        }
        return false;
        }
    }


