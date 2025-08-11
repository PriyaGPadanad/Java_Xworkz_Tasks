package com.xworkz.iterator.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable {
    private String name;
    private String location;
    private int starRating;
    private double pricePerNight;
    private boolean wifi;
    private String checkInTime;
    private String checkOutTime;
    private int totalRooms;
    private String contactEmail;
    private boolean hasRestaurant;

    public HotelDTO(String name,String location, int starRating, double pricePerNight, boolean wifi, String checkInTime, String checkOutTime, int totalRooms, String contactEmail, boolean hasRestaurant){
        this.name = name;
        this.location = location;
        this.starRating = starRating;
        this.pricePerNight = pricePerNight;
        this.wifi = wifi;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.totalRooms = totalRooms;
        this.contactEmail = contactEmail;
        this.hasRestaurant = hasRestaurant;
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

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public boolean isHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", starRating=" + starRating +
                ", pricePerNight=" + pricePerNight +
                ", wifi=" + wifi +
                ", checkInTime='" + checkInTime + '\'' +
                ", checkOutTime='" + checkOutTime + '\'' +
                ", totalRooms=" + totalRooms +
                ", contactEmail='" + contactEmail + '\'' +
                ", hasRestaurant=" + hasRestaurant +
                '}';
    }
}
