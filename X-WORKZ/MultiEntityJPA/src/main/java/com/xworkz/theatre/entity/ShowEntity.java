package com.xworkz.theatre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="show")
public class ShowEntity {
    @Id
    private int id;

    @Column(name="show_name")
    private String showName;

    @Column(name="show_time")
    private String showTime;
    private String language;
    private String duration;
    private double price;

    public ShowEntity(int id, String showName, String showTime, String language, String duration, double price) {
        this.id = id;
        this.showName = showName;
        this.showTime = showTime;
        this.language = language;
        this.duration = duration;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShowEntity{" +
                "id=" + id +
                ", showName='" + showName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", language='" + language + '\'' +
                ", duration='" + duration + '\'' +
                ", price=" + price +
                '}';
    }
}
