package com.xworkz.practice.q1;

import static com.xworkz.practice.q1.PalindromeCheck.checkPalindrome;

public class PalindromeCheckRun {
    public static void main(String[] args){
        String input="madam";
        boolean isPalindrome=checkPalindrome(input);
        if(isPalindrome){
            System.out.println(input+" is a palindrome");

        }
        else{
            System.out.println(input+" is not a palindrome");
        }
    }
}
