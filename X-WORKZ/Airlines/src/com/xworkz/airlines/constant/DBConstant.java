package com.xworkz.airlines.constant;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/airlinedb"),

    USERNAME("root"),

    SECRET("Xworkzodc@123");

    private String prop;

    DBConstant(String prop){
        this.prop=prop;

    }

    public String getProp() {
        return prop;
    }
}
