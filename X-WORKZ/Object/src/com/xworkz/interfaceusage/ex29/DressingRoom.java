package com.xworkz.interfaceusage.ex29;

public class DressingRoom {
    private Mirror mirror;
    public DressingRoom(Mirror mirror){
        this.mirror=mirror;
    }
    public void useMirror(){
        mirror.reflect();
    }

}
