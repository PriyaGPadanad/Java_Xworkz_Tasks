package com.xworkz.interfaceusage.ex17;

public class ComputerDesk {
    private Keyboard keyboard;
    public ComputerDesk(Keyboard keyboard){
        this.keyboard=keyboard;
    }
    public void useKeyboard(){
        keyboard.type();
    }
}
