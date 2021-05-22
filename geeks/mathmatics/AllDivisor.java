package com.kdroid.kotlintuts.geeks.mathmatics;

public class AllDivisor {
    public static void main(String[] args) {
        int n = 15;
        findAllDivisor(n);
        System.out.println();
        findAllDivisorOptimize(n);
    }

    private static void findAllDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }

        /**
         O(n)
         */
    }

    private static void findAllDivisorOptimize(int n) {
        int i;
        for (i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                System.out.print(" " + i);

        //unsorted number
//                if (i != n / i) {
//                    System.out.print(" " + n / i);
//                }

        //sorted number
        for (; i >= 1; i--)
            if (n % i == 0)
                System.out.print(" " + n / i);
    }

}
