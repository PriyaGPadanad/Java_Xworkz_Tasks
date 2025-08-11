package com.xworkz.string.internal;

public class Jalebi {
    private String color;
    private int diameterInCm;
    private boolean isHot;

    public Jalebi(String color, int diameterInCm, boolean isHot) {
        this.color = color;
        this.diameterInCm = diameterInCm;
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return "Jalebi [color=" + color + ", diameter=" + diameterInCm + "cm, isHot=" + isHot + "]";
    }

    @Override
    public int hashCode() {
        return 7644;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jalebi) {
            Jalebi other = (Jalebi) obj;
            return this.color.equals(other.color) && this.isHot == other.isHot;
        }

        return false;
    }
}


