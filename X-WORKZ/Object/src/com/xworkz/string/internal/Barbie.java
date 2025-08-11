package com.xworkz.string.internal;

public class Barbie {
    private String profession;
    private String outfitColor;
    private boolean hasDreamHouse;

    public Barbie(String profession, String outfitColor, boolean hasDreamHouse) {
        this.profession = profession;
        this.outfitColor = outfitColor;
        this.hasDreamHouse = hasDreamHouse;
    }

    @Override
    public String toString() {
        return "Barbie [profession=" + profession + ", outfitColor=" + outfitColor + ", hasDreamHouse=" + hasDreamHouse + "]";
    }

        @Override
        public int hashCode(){
            return 456;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Barbie) {
                Barbie other = (Barbie) obj;
                return this.profession.equals(other.profession);
            }
            return false;
        }

    }



