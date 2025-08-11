package com.xworkz.places.dto;

import java.io.Serializable;

public class PlacesDTO implements Serializable {

    private int placeId;
    private String name;
    private String description;
    private String location;
    private String category;
    private float rating;
    private double entryFee;
    private String openingHours;

 public PlacesDTO(int placeId,String name,String description,String location,String category,float rating,double entryFee,String openingHours){
     this.placeId=placeId;
     this.name=name;
     this.description=description;
     this.location=location;
     this.category=category;
     this.rating=rating;
     this.entryFee=entryFee;
     this.openingHours=openingHours;
 }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public String toString() {
        return "PlacesDTO{" +
                "placeId=" + placeId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", entryFee=" + entryFee +
                ", openingHours='" + openingHours + '\'' +
                '}';
    }
}
