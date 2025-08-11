package com.xworkz.Task;

public class House {
    Room[] rooms;
    HouseKeep[] houseKeeps;

    public House(Room[] rooms, HouseKeep[] houseKeeps) {
        this.rooms = rooms;
        this.houseKeeps = houseKeeps;
    }
    public void displayHouse(){
        for(Room room: rooms){
            System.out.println("Room:"+ room.detail);
        }
        for (HouseKeep houseKeep: houseKeeps){
            System.out.println("Housekeeper transport:"+ houseKeep.transport.detail);
        }
    }
}

