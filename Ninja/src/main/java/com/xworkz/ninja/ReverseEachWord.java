package com.xworkz.ninja;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Programming Ninja";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed words: " + result.toString().trim());
    }
}
