package com.xworkz.string.internal;

public class Mango {
    private String variety;
    private String origin;
    private boolean isRipe;

    public Mango(String variety, String origin, boolean isRipe) {
        this.variety = variety;
        this.origin = origin;
        this.isRipe = isRipe;
    }

    @Override
    public String toString() {
        return "Mango [variety=" + variety + ", origin=" + origin + ", isRipe=" + isRipe + "]";
    }

        @Override
        public int hashCode(){
            return 4236;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mango) {
            Mango other = (Mango) obj;
            return this.variety.equals(other.variety) &&
                    this.isRipe== other.isRipe;
        }
        return false;
    }
}



