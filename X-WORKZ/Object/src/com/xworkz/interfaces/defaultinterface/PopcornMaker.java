package com.xworkz.interfaces.defaultinterface;

public interface PopcornMaker {
    default void pop(){
        System.out.println("PopcornMaker:Standard popping mode");
    }
}
