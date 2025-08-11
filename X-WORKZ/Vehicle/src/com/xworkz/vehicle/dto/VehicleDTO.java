package com.xworkz.vehicle.dto;

import java.io.Serializable;

public class VehicleDTO implements Serializable {
    private int vehicleId;
    private String ownerName;
    private String model;
    private int year;
    private String fuelType;
    private String color;
    private String insuranceStatus;
    private String vehicleType;

    public VehicleDTO(int vehicleId,String ownerName,String model,int year,String fuelType,String color,String insuranceStatus,String vehicleType){
        this.vehicleId=vehicleId;
        this.ownerName=ownerName;
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
        this.color=color;
        this.insuranceStatus=insuranceStatus;
        this.vehicleType=vehicleType;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicleId=" + vehicleId +
                ", ownerName='" + ownerName + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'' +
                ", insuranceStatus='" + insuranceStatus + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
