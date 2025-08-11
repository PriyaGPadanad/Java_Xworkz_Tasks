package com.xworkz.iterator.dto;

import java.io.Serializable;

public class TeacherDTO implements Serializable {
    private String name;
    private int experience;
    private String subject;
    private double salary;
    private String qualification;
    private String gender;
    private String email;
    private int age;
    private String city;
    private boolean permanent;

    public TeacherDTO(String name, int experience, String subject, double salary, String qualification, String gender, String email, int age, String city, boolean permanent) {
        this.name = name;
        this.experience = experience;
        this.subject = subject;
        this.salary = salary;
        this.qualification = qualification;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.city = city;
        this.permanent = permanent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                ", qualification='" + qualification + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", permanent=" + permanent +
                '}';
    }
}
