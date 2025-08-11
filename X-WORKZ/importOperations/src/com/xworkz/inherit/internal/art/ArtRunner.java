package com.xworkz.inherit.internal.art;

public class ArtRunner {
    public static void main(String[] args){
        Art art1=new Art();
        art1.create();
        art1.expressEmotion();
        art1.useMedium();
        art1.gainAudience();

        System.out.println("-------");
        Art art=new StreetArt();
        art.create();
        art.expressEmotion();
        art.useMedium();
        art.gainAudience();
        art.conveyMessage();

        System.out.println("-------");
        StreetArt street =new StreetArt();
        street.create();
        street.expressEmotion();
        street.useMedium();
        street.gainAudience();
        street.conveyMessage();

        System.out.println("---casting Example-----");
        ArtCritic critic=new ArtCritic();
        critic.analyze(art1);
        critic.analyze(art);
        critic.analyze(street);


    }
}
