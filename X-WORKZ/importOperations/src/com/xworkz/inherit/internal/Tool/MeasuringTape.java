package com.xworkz.inherit.internal.Tool;

public class MeasuringTape extends Tool{
    public MeasuringTape() {
        super();
        System.out.println("Running non-arg constructor MeasuringTape");
    }

    @Override
    public void use() {
        System.out.println("Measuring distances --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Flexible steel or fiberglass tape --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Measuring Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for measuring length or size --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable and retractable --child");
    }
}
