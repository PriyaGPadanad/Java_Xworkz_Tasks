package com.xworkz.string.internal;

public class Jaggu {
    private String species;
    private String favoriteFruit;
    private boolean canTalk;

    public Jaggu(String species, String favoriteFruit, boolean canTalk) {
        this.species = species;
        this.favoriteFruit = favoriteFruit;
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return "Jaggu [species=" + species + ", favoriteFruit=" + favoriteFruit + ", canTalk=" + canTalk + "]";
    }


        @Override
        public int hashCode(){
            return 87555;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jaggu) {
            Jaggu other = (Jaggu) obj;
            return this.species.equals(other.species) &&
                    this.canTalk== other.canTalk;
        }
        return false;
    }
}



