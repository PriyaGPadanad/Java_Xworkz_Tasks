package com.xworkz.ninja;
public class PrimeNumbersBetween {
    public static void main(String[] args) {
        int n = 50; // Upper limit
        System.out.println("Prime numbers between 1 and " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
