package com.xworkz.inherit.internal.media;

public class Journalist {
    public void report(Media media) {
        media.publish();
        media.distribute();
        media.display();
        media.update();
        media.archive();

        if (media instanceof Newspaper) {
            System.out.println("media is an instance of Newspaper");
            Newspaper news = (Newspaper) media;
            news.printHeadlines();
        }
    }
}
