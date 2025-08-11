package com.xworkz.priya.dto;

import java.io.Serializable;

public class PriyaDTO implements Serializable {

    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;

    public PriyaDTO(String name, int age, String phoneNumber, String email, String address) {

        this.name= name;
        this.age= age;
        this.phoneNumber= phoneNumber;
        this.email= email;
        this.address= address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PriyaDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
