package com.xworkz.string.internal;

public class DeskPlant {
    private String plantName;
    private boolean isArtificial;
    private String potColor;

    public DeskPlant(String plantName, boolean isArtificial, String potColor) {
        this.plantName = plantName;
        this.isArtificial = isArtificial;
        this.potColor = potColor;
    }

    @Override
    public String toString() {
        return "DeskPlant [plantName=" + plantName + ", artificial=" + isArtificial + ", potColor=" + potColor + "]";
    }

        @Override
        public int hashCode(){
            return 2446;
        }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DeskPlant) {
            DeskPlant other = (DeskPlant) obj;
            return this.plantName.equals(other.plantName);
        }
        return false;
    }

    }


