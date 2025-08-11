package com.xworkz.inherit.internal.Tool;

public class WireStripper extends Tool{
    public WireStripper() {
        super();
        System.out.println("Running non-arg constructor WireStripper");
    }

    @Override
    public void use() {
        System.out.println("Stripping insulation from wires --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel with rubber grip --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Electrical Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Prepares wires for connections --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Good durability for home use --child");
    }
}
