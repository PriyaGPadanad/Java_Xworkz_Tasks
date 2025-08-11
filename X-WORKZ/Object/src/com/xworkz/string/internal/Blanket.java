package com.xworkz.string.internal;

public class Blanket {
    private String material;
    private String size;
    private boolean isElectric;

    public Blanket(String material, String size, boolean isElectric) {
        this.material = material;
        this.size = size;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Blanket [material=" + material + ", size=" + size + ", isElectric=" + isElectric + "]";
    }

        @Override
        public int hashCode(){
            return 654;
        }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Blanket) {
            Blanket other = (Blanket) obj;
            return this.material.equals(other.material);
        }
        return false;
    }
}
