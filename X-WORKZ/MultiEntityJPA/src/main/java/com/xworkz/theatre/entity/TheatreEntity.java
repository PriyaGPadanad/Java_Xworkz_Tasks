package com.xworkz.theatre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatre")
public class TheatreEntity {
    @Id
    private int id;

    @Column(name="theatre_name")
    private String theatreName;

    private String location;
    private int capacity;
    private int screens;
    private long contact;

    public TheatreEntity(int id, String theatreName, String location, int capacity, int screens, long contact) {
        this.id = id;
        this.theatreName = theatreName;
        this.location = location;
        this.capacity = capacity;
        this.screens = screens;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getScreens() {
        return screens;
    }

    public void setScreens(int screens) {
        this.screens = screens;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "TheatreEntity{" +
                "id=" + id +
                ", theatreName='" + theatreName + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", screens=" + screens +
                ", contact=" + contact +
                '}';
    }
}
