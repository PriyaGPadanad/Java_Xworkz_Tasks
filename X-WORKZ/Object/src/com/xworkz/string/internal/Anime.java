package com.xworkz.string.internal;

public class Anime {
    private String title;
    private String mainCharacter;
    private boolean hasMultipleSeasons;

    public Anime(String title, String mainCharacter, boolean hasMultipleSeasons) {
        this.title = title;
        this.mainCharacter = mainCharacter;
        this.hasMultipleSeasons = hasMultipleSeasons;
    }

    @Override
    public String toString() {
        return "Anime [title=" + title + ", mainCharacter=" + mainCharacter + ", hasMultipleSeasons=" + hasMultipleSeasons + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Anime) {
            Anime other = (Anime) obj;
            return this.title.equals(other.title);
        }
        return false;
    }


    }

