package com.xworkz.string.internal;

public class ElectricBlanket {
    private String material;
    private int heatLevels;
    private boolean washable;

    public ElectricBlanket(String material, int heatLevels, boolean washable) {
        this.material = material;
        this.heatLevels = heatLevels;
        this.washable = washable;
    }

    @Override
    public String toString() {
        return "ElectricBlanket [material=" + material + ", heatLevels=" + heatLevels + ", washable=" + washable + "]";
    }


        @Override
        public int hashCode(){
            return 54;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElectricBlanket) {
            ElectricBlanket other = (ElectricBlanket) obj;
            return this.material.equals(other.material) && this.heatLevels==other.heatLevels;
        }
        return false;
    }
    }


