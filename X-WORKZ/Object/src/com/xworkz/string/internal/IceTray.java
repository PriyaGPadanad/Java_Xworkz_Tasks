package com.xworkz.string.internal;

public class IceTray {
    private int cubeCount;
    private String material;
    private boolean isFlexible;

    public IceTray(int cubeCount, String material, boolean isFlexible) {
        this.cubeCount = cubeCount;
        this.material = material;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "IceTray [cubes=" + cubeCount + ", material=" + material + ", flexible=" + isFlexible + "]";
    }

        @Override
        public int hashCode(){
            return 8563;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IceTray) {
            IceTray other = (IceTray) obj;
            return this.material.equals(other.material) &&
                    this.cubeCount == other.cubeCount;
        }
        return false;
    }
    }


