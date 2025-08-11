package com.xworkz.inherit.internal.Tool;

public class SushiMat extends Tool{
    public SushiMat() {
        super();
        System.out.println("Running non-arg constructor SushiMat -- child");
    }

    @Override
    public void use() {
        System.out.println("Rolling sushi -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Sushi mat made of bamboo -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Rolling Mat -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to roll sushi rolls -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Flexible but long-lasting -- child");
    }
}
