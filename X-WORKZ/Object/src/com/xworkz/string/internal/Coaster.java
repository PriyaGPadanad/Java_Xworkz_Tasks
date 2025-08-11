package com.xworkz.string.internal;

public class Coaster {
    private String design;
    private String material;
    private boolean isReusable;

    public Coaster(String design, String material, boolean isReusable) {
        this.design = design;
        this.material = material;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Coaster [design=" + design + ", material=" + material + ", reusable=" + isReusable + "]";
    }

        @Override
        public int hashCode(){
            return 7788;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coaster) {
            Coaster other = (Coaster) obj;
            return this.design.equals(other.design);
        }
        return false;
    }

}


