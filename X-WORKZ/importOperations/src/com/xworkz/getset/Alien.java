package com.xworkz.getset;

public class Alien {
    private String seenBy;
    private String seenDate;
    private String describe;

    public Alien(String seenBy, String seenDate, String describe) {
        this.seenBy = seenBy;
        this.seenDate = seenDate;
        this.describe = describe;
    }

    public String getSeenBy() {
        return seenBy;
    }

    public void setSeenBy(String seenBy) {
        this.seenBy = seenBy;
    }

    public String getSeenDate() {
        return seenDate;
    }

    public void setSeenDate(String seenDate) {
        this.seenDate = seenDate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
