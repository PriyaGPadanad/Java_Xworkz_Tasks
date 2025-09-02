package com.xworkz.ninja;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int temp = num, reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (num == reversed) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
    }
}
