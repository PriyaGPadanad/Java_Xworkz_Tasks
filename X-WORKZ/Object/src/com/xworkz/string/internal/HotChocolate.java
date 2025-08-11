package com.xworkz.string.internal;

public class HotChocolate {
    private String cupSize;      // Small, Medium, Large
    private boolean hasMarshmallows;
    private String milkType;     // Dairy, Almond, Oat etc.

    public HotChocolate(String cupSize, boolean hasMarshmallows, String milkType) {
        this.cupSize = cupSize;
        this.hasMarshmallows = hasMarshmallows;
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return "HotChocolate [cupSize=" + cupSize + ", hasMarshmallows=" + hasMarshmallows + ", milkType=" + milkType + "]";
    }

        @Override
        public int hashCode(){
            return 13452;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HotChocolate) {
            HotChocolate other = (HotChocolate) obj;
            return this.cupSize.equals(other.cupSize) &&
                    this.milkType.equals(other.milkType);
        }
        return false;
    }
    }


