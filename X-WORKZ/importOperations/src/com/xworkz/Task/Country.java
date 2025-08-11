package com.xworkz.Task;

public class Country {
    String name;
    PrimeMinister primeMinister;
    Minister[] ministers;
    State[] states;
    Security security;
    House house;

    public Country(String name, PrimeMinister primeMinister, Minister[] ministers, State[] states, Security security, House house) {
        this.name = name;
        this.primeMinister = primeMinister;
        this.ministers = ministers;
        this.states = states;
        this.security = security;
        this.house = house;
    }

    public void display() {
        System.out.println("Country: " + name);
        System.out.println("Prime Minister: " + primeMinister.name);
        for (Minister minister : ministers) {
            System.out.println("Minister: " + minister.name);
            for(PersonalAssistant assistant: minister.personalAssistants){
                System.out.println("Personal assistant:"+ assistant.name);
            }
        }
        System.out.println("Security:");
        security.displaySecurity();
        System.out.println("House details:");
        house.displayHouse();

    }
}
