package com.xworkz.inherit.internal.Travel;

public class TravelRunner {
    public static void main(String[] args) {
        Compass t1 = new Compass();
        t1.use(); t1.getMaterial();
        t1.getCategory();
        t1.getPurpose();
        t1.getDurability();
        System.out.println("---------------");

        Binoculars t2 = new Binoculars();
        t2.use();
        t2.getMaterial();
        t2.getCategory();
        t2.getPurpose();
        t2.getDurability();
        System.out.println("---------------");

        InflatablePillow t3 = new InflatablePillow();
        t3.use();
        t3.getMaterial();
        t3.getCategory();
        t3.getPurpose();
        t3.getDurability();
        System.out.println("---------------");

        TravelAdapter t4 = new TravelAdapter();
        t4.use();
        t4.getMaterial();
        t4.getCategory();
        t4.getPurpose();
        t4.getDurability();
        System.out.println("---------------");

        LuggageScale t5 = new LuggageScale();
        t5.use();
        t5.getMaterial();
        t5.getCategory();
        t5.getPurpose();
        t5.getDurability();
        System.out.println("---------------");

        HikingPole t6 = new HikingPole();
        t6.use();
        t6.getMaterial();
        t6.getCategory();
        t6.getPurpose();
        t6.getDurability();
        System.out.println("---------------");

        TentStakes t7 = new TentStakes();
        t7.use();
        t7.getMaterial();
        t7.getCategory();
        t7.getPurpose();
        t7.getDurability();
        System.out.println("---------------");

        IceScraper t8 = new IceScraper();
        t8.use();
        t8.getMaterial();
        t8.getCategory();
        t8.getPurpose();
        t8.getDurability();
        System.out.println("---------------");

        PicnicBasket t9 = new PicnicBasket();
        t9.use();
        t9.getMaterial();
        t9.getCategory();
        t9.getPurpose();
        t9.getDurability();
        System.out.println("---------------");

        SnowBoots t10 = new SnowBoots();
        t10.use();
        t10.getMaterial();
        t10.getCategory();
        t10.getPurpose();
        t10.getDurability();
        System.out.println("---------------");
    }
}
