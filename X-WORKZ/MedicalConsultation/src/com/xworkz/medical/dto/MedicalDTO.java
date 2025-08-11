package com.xworkz.medical.dto;

import java.io.Serializable;


public class MedicalDTO implements Serializable {

    private String name;
    private String email;
    private int age;
    private String gender;
    private String contactNumber;
    private String consultationMode;

    public MedicalDTO(String name, String email, int age, String gender, String contactNumber, String consultationMode){
        this.name=name;
        this.email=email;
        this.age=age;
        this.gender=gender;
        this.contactNumber=contactNumber;
        this.consultationMode=consultationMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getConsultationMode() {
        return consultationMode;
    }

    public void setConsultationMode(String consultationMode) {
        this.consultationMode = consultationMode;
    }



    @Override
    public String toString() {
        return "MedicalDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", consultationMode='" + consultationMode +
                '}';
    }
}
