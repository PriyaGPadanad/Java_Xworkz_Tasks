package com.xworkz.string.internal;

public class InductionStove {
    private String brand;
    private int powerWatts;
    private boolean autoSwitchOff;

    public InductionStove(String brand, int powerWatts, boolean autoSwitchOff) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.autoSwitchOff = autoSwitchOff;
    }

    @Override
    public String toString() {
        return "InductionStove [brand=" + brand + ", power=" + powerWatts + "W, autoSwitchOff=" + autoSwitchOff + "]";
    }

        @Override
        public int hashCode(){
            return 1536;
        }



        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InductionStove) {
                InductionStove other = (InductionStove) obj;
                return this.brand.equals(other.brand) &&
                        this.powerWatts== other.powerWatts;
            }
            return false;
        }
    }






