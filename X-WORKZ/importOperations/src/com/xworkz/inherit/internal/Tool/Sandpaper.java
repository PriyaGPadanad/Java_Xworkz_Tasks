package com.xworkz.inherit.internal.Tool;

public class Sandpaper extends Tool{
    public Sandpaper() {
        super();
        System.out.println("Running non-arg constructor Sandpaper");
    }

    @Override
    public void use() {
        System.out.println("Smoothing surfaces --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Abrasive grit on paper backing --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Smoothing Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for polishing and finishing --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Disposable after use --child");
    }
}
