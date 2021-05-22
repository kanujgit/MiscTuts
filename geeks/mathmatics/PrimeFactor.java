package com.kdroid.kotlintuts.geeks.mathmatics;

public class PrimeFactor {

    public static void main(String[] args) {
        int n = 12090;
        findPrimeFactor(n);
        System.out.println();
        optimizePrimeFactor(n);
    }

    private static void findPrimeFactor(int n) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(" " + i);
                    x = x * i;
                }
            }
        }
    }

    private static void optimizePrimeFactor(int n) {
        if (n <= 1) {
            return;
        }
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }
        for (int i = 5; i <= Math.sqrt(n); i = i +1) {
            while (n % i == 0) {
                System.out.print(" " + i);
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(" " + n);
        }
    }

    /**
     * helper class
     */
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
