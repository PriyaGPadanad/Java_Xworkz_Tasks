package com.xworkz.inherit.internal.Tool;

public class MortarPestle extends Tool{
    public MortarPestle() {
        super();
        System.out.println("Running non-arg constructor MortarPestle -- child");
    }

    @Override
    public void use() {
        System.out.println("Grinding manually with mortar and pestle -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Mortar and pestle made of stone -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Manual Grinder -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for grinding spices/herbs -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Very long-lasting -- child");
    }
}
