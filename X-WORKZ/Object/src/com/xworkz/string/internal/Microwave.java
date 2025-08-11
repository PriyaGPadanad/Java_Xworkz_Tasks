package com.xworkz.string.internal;

public class Microwave {
    private String brand;
    private int powerWatts;
    private boolean hasGrillFunction;

     public Microwave(String brand,int powerWatts,boolean hasGrillFunction){
        this.brand=brand;
        this.powerWatts=powerWatts;
        this.hasGrillFunction=hasGrillFunction;
    }

    @Override
    public String toString() {
        return "Microwave [brand=" + brand + "," + " power=" + powerWatts + "W, grillFunction=" + hasGrillFunction + "]";
    }

        @Override
        public int hashCode(){
            return 9774;
        }

        @Override
    public boolean equals(Object obj){
         if(obj instanceof Microwave){
             Microwave other=(Microwave)obj;
             return this.brand.equals(other.brand) && this.powerWatts==other.powerWatts && this.hasGrillFunction==other.hasGrillFunction;
         }
         return false;
        }
    }


