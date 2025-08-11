package com.xworkz.inherit.internal.Travel;

public class PicnicBasket extends Travel{
    public PicnicBasket() {
        super();
        System.out.println("Picnic Basket created -- child");
    }

    @Override
    public void use() {
        System.out.println("Carries food for outdoor meals -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Wicker or canvas -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Outdoor Food Carrier -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Organizes and stores food on trips -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Sturdy and reusable -- child");
    }
}
