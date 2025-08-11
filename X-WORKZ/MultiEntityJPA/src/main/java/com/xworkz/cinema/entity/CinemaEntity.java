package com.xworkz.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cinema")
public class CinemaEntity {
    @Id
    private int id;
    @Column(name="cinema_name")
    private String cinemaName;
    private String location;
    private int screens;
    private double rating;

    public CinemaEntity(int id, String cinemaName, String location, int screens, double rating) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.location = location;
        this.screens = screens;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getScreens() {
        return screens;
    }

    public void setScreens(int screens) {
        this.screens = screens;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CinemaEntity{" +
                "id=" + id +
                ", cinemaName='" + cinemaName + '\'' +
                ", location='" + location + '\'' +
                ", screens=" + screens +
                ", rating=" + rating +
                '}';
    }
}
