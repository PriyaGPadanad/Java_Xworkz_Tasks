package com.xworkz.string.internal;

public class Bean {
    private String fullName;
    private String favoriteItem;
    private boolean drivesMiniCar;

    public Bean(String fullName, String favoriteItem, boolean drivesMiniCar) {
        this.fullName = fullName;
        this.favoriteItem = favoriteItem;
        this.drivesMiniCar = drivesMiniCar;
    }

    @Override
    public String toString() {
        return "Bean [fullName=" + fullName + ", favoriteItem=" + favoriteItem + ", drivesMiniCar=" + drivesMiniCar + "]";
    }

        @Override
        public int hashCode(){
            return 789;
        }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bean) {
            Bean other = (Bean) obj;
            return this.fullName.equals(other.fullName);
        }
        return false;
    }



}
