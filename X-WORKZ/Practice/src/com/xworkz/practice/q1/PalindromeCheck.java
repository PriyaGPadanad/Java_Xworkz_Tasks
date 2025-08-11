package com.xworkz.practice.q1;

public class PalindromeCheck {
    public static boolean checkPalindrome(String str){
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
