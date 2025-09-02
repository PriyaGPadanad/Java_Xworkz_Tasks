package com.xworkz.ninja;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;

        // Using loop
        int factLoop = 1;
        for (int i = 1; i <= num; i++) {
            factLoop *= i;
        }
        System.out.println("Factorial of " + num + " using loop: " + factLoop);

        // Using recursion
        int factRecursion = factorial(num);
        System.out.println("Factorial of " + num + " using recursion: " + factRecursion);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
