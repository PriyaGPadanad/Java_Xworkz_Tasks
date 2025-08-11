package com.xworkz.map.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.Serializable;
@AllArgsConstructor
@ToString
@Getter
@Setter
public class TrainDTO implements Serializable {
    private String trainCategory;
    private String source;
    private String destination;
    private String coachType;
    private int pnrNumber;
    private String trainType;
    private int noOfPassenger;
    private String travelDuration;
    private int price;
    private String seatType;
}
