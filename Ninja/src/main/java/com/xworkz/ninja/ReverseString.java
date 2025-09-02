package com.xworkz.ninja;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ninja";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
