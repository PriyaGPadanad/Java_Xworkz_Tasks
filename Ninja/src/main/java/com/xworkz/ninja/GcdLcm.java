package com.xworkz.ninja;

public class GcdLcm {
    public static void main(String[] args) {
        int a = 12, b = 18;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }

    static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
