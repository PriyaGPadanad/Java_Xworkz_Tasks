package com.xworkz.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class HospitalEntity {
    @Id
    private int id;
    @Column(name="hospital_name")
    private String hospitalName;
    private String city;
    private String type;
    private int capacity;
    private long contact;

    public HospitalEntity(int id, String hospitalName, String city, String type, int capacity, long contact) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.city = city;
        this.type = type;
        this.capacity = capacity;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "HospitalEntity{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", contact=" + contact +
                '}';
    }
}
