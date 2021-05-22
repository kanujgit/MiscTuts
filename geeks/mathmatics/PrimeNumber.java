package com.kdroid.kotlintuts.geeks.mathmatics;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5001;
      //  primeNumber(n);
        primeNumberOptimize(n);
        System.out.println();
        sieveOfEratosthenes(n);
    }

    private static void primeNumber(int n) {
        if (n == 1) {
            System.out.println("No");
        }
        boolean flag;
        for (int j = 2; j < n; j++) {
            flag = false;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(j + "\t");
        }
        System.out.println();

    }

    private static void primeNumberOptimize(int n) {
        if (n == 1) {
            System.out.println("No");
        }
        boolean flag;
        for (int j = 2; j < n; j++) {
            flag = false;
            // check divisible by 2 and 3
            if (!(j % 2 == 0 || j % 3 == 0)) {
                for (int i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        flag = true;
                        break;
                    }
                }
            } else {
                if (!(j == 2 | j == 3)) {
                    flag = true;
                }
            }
            if (!flag)
                System.out.print(j + "\t");
        }

    }

    /**
     * O(nroot(n))
     */

    private static void sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                // check divisible no.
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + "\t");
        }

    }
}
