package com.xworkz.string.internal;

public class Chutki {
    private String bestFriend;
    private String favoriteColor;
    private boolean helpsBheem;

    public Chutki(String bestFriend, String favoriteColor, boolean helpsBheem) {
        this.bestFriend = bestFriend;
        this.favoriteColor = favoriteColor;
        this.helpsBheem = helpsBheem;
    }

    @Override
    public String toString() {
        return "Chutki [bestFriend=" + bestFriend + ", favoriteColor=" + favoriteColor + ", helpsBheem=" + helpsBheem + "]";
    }

        @Override
        public int hashCode(){
            return 5566;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chutki) {
            Chutki other = (Chutki) obj;
            return this.bestFriend.equals(other.bestFriend);
        }
        return false;
    }

}


