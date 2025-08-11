package com.xworkz.inherit.internal.media;

public class MediaRunner {
    public static void main(String[] args) {
        Media media1 = new Media();
        media1.publish();
        media1.distribute();
        media1.display();
        media1.update();
        media1.archive();

        System.out.println("-------------------");
        Media media = new Newspaper();
        media.publish();
        media.distribute();
        media.display();
        media.update();
        media.archive();

        System.out.println("-----------------");
        Newspaper newspaper = new Newspaper();
        newspaper.publish();
        newspaper.distribute();
        newspaper.display();
        newspaper.update();
        newspaper.archive();

        System.out.println("-------casting example------------");
        Journalist journalist = new Journalist();
        journalist.report(media1);
        journalist.report(media);
        journalist.report(newspaper);
    }
}
