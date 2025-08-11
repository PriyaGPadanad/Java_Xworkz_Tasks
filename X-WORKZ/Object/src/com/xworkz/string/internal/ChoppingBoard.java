package com.xworkz.string.internal;

public class ChoppingBoard {
    private String material;
    private boolean isDishwasherSafe;
    private String shape;

    public ChoppingBoard(String material, boolean isDishwasherSafe, String shape) {
        this.material = material;
        this.isDishwasherSafe = isDishwasherSafe;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "ChoppingBoard [material=" + material + ", dishwasherSafe=" + isDishwasherSafe + ", shape=" + shape + "]";
    }

        @Override
        public int hashCode(){
            return 3344;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChoppingBoard) {
            ChoppingBoard other = (ChoppingBoard) obj;
            return this.material.equals(other.material);
        }
        return false;
    }

}


