package com.xworkz.inherit.internal.Tool;

public class AllenWrench extends Tool{
    public AllenWrench() {
        super();
        System.out.println("Running non-arg constructor AllenWrench");
    }

    @Override
    public void use() {
        System.out.println("Tightening hex screws --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Made of tempered steel --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Hand Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to drive bolts and screws with hex heads --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Highly durable for mechanical use --child");
    }
}
