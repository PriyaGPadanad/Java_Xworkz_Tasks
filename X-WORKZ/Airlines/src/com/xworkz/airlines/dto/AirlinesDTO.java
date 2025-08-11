package com.xworkz.airlines.dto;

import java.io.Serializable;

public class AirlinesDTO implements Serializable {

    private int id;
    private String name;
    private String source;
    private String destination;
    private String flightCode;
    private String classType;
    private String mealType;
    private String international;


   public AirlinesDTO(String name, String source, String destination, String flightCode, String classType, String mealType, String international) {

       this.name=name;
       this.source=source;
       this.destination=destination;
       this.flightCode=flightCode;
       this.classType=classType;
       this.mealType=mealType;
       this.international=international;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    @Override
    public String toString() {
        return "AirlinesDTO{" +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", classType='" + classType + '\'' +
                ", mealType='" + mealType + '\'' +
                ", international='" + international + '\'' +
                '}';
    }

    public void setId(int pk) {
       this.id=id;
    }

    public int getId() {
        return id;
    }
}
