package com.xworkz.inherit.internal.art;

public class ArtCritic {
    public void analyze(Art art){
        art.create();
        art.expressEmotion();
        art.useMedium();
        art.gainAudience();
        art.conveyMessage();

        if(art instanceof StreetArt){
            System.out.println("art is an instance of StreetArt");
            StreetArt streetArt=(StreetArt)art;
            streetArt.collaborateWithCommunity();
        }
    }
}
