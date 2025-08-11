package com.xworkz.string.internal;

public class LaptopStand {
    private String material;
    private boolean isAdjustable;
    private String color;

    public LaptopStand(String material, boolean isAdjustable, String color) {
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LaptopStand [material=" + material + ", adjustable=" + isAdjustable + ", color=" + color + "]";
    }

        @Override
        public int hashCode(){
            return 8553;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof LaptopStand){
            LaptopStand other=(LaptopStand)obj;
            return this.material.equals(other.material) && this.isAdjustable==other.isAdjustable;
        }
        return false;
        }
    }


