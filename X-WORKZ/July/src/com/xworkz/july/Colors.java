package com.xworkz.july;

import java.util.ArrayList;
import java.util.Collection;

public class Colors {
    public static void main(String[] args) {
        Collection<String>colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("The number of colors in the list are "+colors.size());

        colors.clear();

        System.out.println("The number of colors in the list After the clear"+colors.size());

        colors.add("SkyBlue");
        colors.add("Silver");
        colors.add("Gold");
        colors.add("Purple");
        colors.add("Dark Green");
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("lavender");
        colors.add("magenta");
        colors.add("peach");

        System.out.println("The number of Colors in the list are"+colors.size());
    }
}
