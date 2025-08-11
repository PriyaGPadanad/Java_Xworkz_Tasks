package com.xworkz.getset;

public class Jail {
    private String name;
    private String location;
    private String jailerName;
    private int totalCells;

    public Jail(String name, String location, String jailerName, int totalCells) {
        this.name = name;
        this.location = location;
        this.jailerName = jailerName;
        this.totalCells = totalCells;
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

    public String getJailerName() {
        return jailerName;
    }

    public void setJailerName(String jailerName) {
        this.jailerName = jailerName;
    }

    public int getTotalCells() {
        return totalCells;
    }

    public void setTotalCells(int totalCells) {
        this.totalCells = totalCells;
    }
}
