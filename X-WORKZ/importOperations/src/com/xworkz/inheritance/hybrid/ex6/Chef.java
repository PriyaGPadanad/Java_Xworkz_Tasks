package com.xworkz.inheritance.hybrid.ex6;

public class Chef extends Person implements Cook{
    @Override
    public void prepareDish(){
        System.out.println("Chef is preparing a gourmet dish");
    }
}
