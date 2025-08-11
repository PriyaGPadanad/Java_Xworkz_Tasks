package com.xworkz.string.internal;

public class InstantCamera {
    private String brand;
    private String photoSize;
    private boolean hasSelfieMode;

    public InstantCamera(String brand, String photoSize, boolean hasSelfieMode) {
        this.brand = brand;
        this.photoSize = photoSize;
        this.hasSelfieMode = hasSelfieMode;
    }

    @Override
    public String toString() {
        return "InstantCamera [brand=" + brand + ", photoSize=" + photoSize + ", hasSelfieMode=" + hasSelfieMode + "]";
    }

        @Override
        public int hashCode(){
            return 767245;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstantCamera) {
            InstantCamera other = (InstantCamera) obj;
            return this.brand.equals(other.brand) &&
                    this.hasSelfieMode== other.hasSelfieMode;
        }
        return false;
    }
}



