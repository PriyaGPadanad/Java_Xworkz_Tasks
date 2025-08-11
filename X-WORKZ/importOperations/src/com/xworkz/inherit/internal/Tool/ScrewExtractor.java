package com.xworkz.inherit.internal.Tool;

public class ScrewExtractor extends Tool{
    public ScrewExtractor() {
        super();
        System.out.println("Running non-arg constructor ScrewExtractor");
    }

    @Override
    public void use() {
        System.out.println("Removing damaged screws --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Hardened steel --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Repair Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for extracting stripped screws --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Highly durable under torque --child");
    }
}
