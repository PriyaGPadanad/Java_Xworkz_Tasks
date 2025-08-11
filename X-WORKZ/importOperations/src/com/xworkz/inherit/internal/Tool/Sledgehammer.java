package com.xworkz.inherit.internal.Tool;

public class Sledgehammer extends Tool{
    public Sledgehammer() {
        super();
        System.out.println("Running non-arg constructor Sledgehammer");
    }

    @Override
    public void use() {
        System.out.println("Breaking heavy objects --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel head with wooden/fiberglass handle --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Heavy Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Demolition and forceful strikes --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Highly durable --child");
    }
}
