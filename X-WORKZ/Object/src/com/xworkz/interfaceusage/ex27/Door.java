package com.xworkz.interfaceusage.ex27;

public class Door {
    private Lock lock;
    public Door(Lock lock){
        this.lock=lock;
    }
    public void lockDoor(){
        lock.secure();
    }
}
