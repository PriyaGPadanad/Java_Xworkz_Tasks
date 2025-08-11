package com.xworkz.string.internal;

public class HairStraightener {
    private String brand;
    private int tempRange;
    private boolean ceramicCoating;

    public HairStraightener(String brand, int tempRange, boolean ceramicCoating) {
        this.brand = brand;
        this.tempRange = tempRange;
        this.ceramicCoating = ceramicCoating;
    }

    @Override
    public String toString() {
        return "HairStraightener [brand=" + brand + ", temp=" + tempRange + "°C, ceramic=" + ceramicCoating + "]";
    }


        @Override
        public int hashCode(){
            return 4364;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof HairStraightener){
            HairStraightener other=(HairStraightener) obj;
            return this.brand.equals(other.brand) && this.ceramicCoating==other.ceramicCoating;
        }
        return false;
        }

    }


