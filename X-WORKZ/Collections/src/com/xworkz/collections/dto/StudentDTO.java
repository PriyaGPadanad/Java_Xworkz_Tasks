package com.xworkz.collections.dto;

public class StudentDTO {
    private String name;
    private int age;
    private String college;
    private String branch;
    private int year;
    private double percentage;
    private boolean placementStatus;

    public StudentDTO(String name,int age,String college,String branch,int year,double percentage,boolean placementStatus){
        this.name=name;
        this.age=age;
        this.college=college;
        this.branch=branch;
        this.year=year;
        this.percentage=percentage;
        this.placementStatus=placementStatus;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public boolean isPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(boolean placementStatus) {
        this.placementStatus = placementStatus;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                ", percentage=" + percentage +
                ", placementStatus=" + placementStatus +
                '}';
    }
}
