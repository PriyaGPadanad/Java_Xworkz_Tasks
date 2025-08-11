package com.xworkz.interfaceusage.ex25;

public class Library {
    private Scanner scanner;
    public Library(Scanner scanner){
        this.scanner=scanner;
    }
    public void digitizeBooks(){
        scanner.scan();
    }
}
