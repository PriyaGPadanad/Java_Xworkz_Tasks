package com.xworkz.inherit.internal.clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing c1 = new Clothing();
        c1.wear();
        c1.wash();
        c1.fold();
        c1.dry();
        c1.store();

        System.out.println("-------------------");
        Clothing c = new Raincoat();
        c.wear();
        c.wash();
        c.fold();
        c.dry();
        c.store();

        System.out.println("-----------------");
        Raincoat raincoat = new Raincoat();
        raincoat.wear();
        raincoat.wash();
        raincoat.fold();
        raincoat.dry();
        raincoat.store();

        System.out.println("-------casting example------------");
        Dresser dresser = new Dresser();
        dresser.organize(c1);
        dresser.organize(c);
        dresser.organize(raincoat);
    }
}
