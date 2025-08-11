package com.xworkz.string.internal;

public class Cushion {
    private String shape;
    private String fabric;
    private boolean isWashable;

    public Cushion(String shape, String fabric, boolean isWashable) {
        this.shape = shape;
        this.fabric = fabric;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "Cushion [shape=" + shape + ", fabric=" + fabric + ", isWashable=" + isWashable + "]";
    }


        @Override
        public int hashCode(){
            return 876554;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cushion) {
            Cushion other = (Cushion) obj;
            return this.shape.equals(other.shape);
        }
        return false;
    }

}



