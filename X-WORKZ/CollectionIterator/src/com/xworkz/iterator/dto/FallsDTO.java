package com.xworkz.iterator.dto;

import java.io.Serializable;

public class FallsDTO implements Serializable {
    private String name;
    private String location;
    private String State;
    private int heightInMeters;
    private boolean isSeasonal;
    private boolean hasTrekking;
    private boolean hasEntryFee;
    private String waterType;
    private String bestTimeToVisit;
    private boolean isFamous;

    public FallsDTO(String name,String location,String State,int heightInMeters,boolean isSeasonal,boolean hasTrekking,boolean hasEntryFee,String waterType,String bestTimeToVisit,boolean isFamous){
        this.name=name;
        this.location=location;
        this.State=State;
        this.heightInMeters=heightInMeters;
        this.isSeasonal=isSeasonal;
        this.hasTrekking=hasTrekking;
        this.hasEntryFee=hasEntryFee;
        this.waterType=waterType;
        this.bestTimeToVisit=bestTimeToVisit;
        this.isFamous=isFamous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(int heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }

    public boolean isHasTrekking() {
        return hasTrekking;
    }

    public void setHasTrekking(boolean hasTrekking) {
        this.hasTrekking = hasTrekking;
    }

    public boolean isHasEntryFee() {
        return hasEntryFee;
    }

    public void setHasEntryFee(boolean hasEntryFee) {
        this.hasEntryFee = hasEntryFee;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getBestTimeToVisit() {
        return bestTimeToVisit;
    }

    public void setBestTimeToVisit(String bestTimeToVisit) {
        this.bestTimeToVisit = bestTimeToVisit;
    }

    public boolean isFamous() {
        return isFamous;
    }

    public void setFamous(boolean famous) {
        isFamous = famous;
    }

    @Override
    public String toString() {
        return "FallsDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", State='" + State + '\'' +
                ", heightInMeters=" + heightInMeters +
                ", isSeasonal=" + isSeasonal +
                ", hasTrekking=" + hasTrekking +
                ", hasEntryFee=" + hasEntryFee +
                ", waterType='" + waterType + '\'' +
                ", bestTimeToVisit='" + bestTimeToVisit + '\'' +
                ", isFamous=" + isFamous +
                '}';
    }
}
