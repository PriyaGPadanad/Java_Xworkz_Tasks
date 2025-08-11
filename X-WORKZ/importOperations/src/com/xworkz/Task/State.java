package com.xworkz.Task;

public class State {
    String name;
    District[] districts;
    City[] cities;

    public State(String name, District[] districts, City[] cities) {
        this.name = name;
        this.districts = districts;
        this.cities = cities;
    }
}
