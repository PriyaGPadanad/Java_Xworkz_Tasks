package com.xworkz.inherit.internal.Tool;

public class PaintRoller extends Tool{
    public PaintRoller() {
        super();
        System.out.println("Running non-arg constructor PaintRoller");
    }

    @Override
    public void use() {
        System.out.println("Applying paint evenly on surfaces --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Foam or fabric on a metal frame --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Painting Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to paint walls and ceilings --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Replaceable rollers, reusable frame --child");
    }
}
