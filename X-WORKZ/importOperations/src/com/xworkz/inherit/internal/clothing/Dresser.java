package com.xworkz.inherit.internal.clothing;

public class Dresser {
    public void organize(Clothing clothing) {
        clothing.wear();
        clothing.wash();
        clothing.fold();
        clothing.dry();
        clothing.store();

        if (clothing instanceof Raincoat) {
            System.out.println("clothing is an instance of Raincoat");
            Raincoat raincoat = (Raincoat) clothing;
            raincoat.repelWater();
        }
    }
}
