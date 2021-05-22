package com.kdroid.kotlintuts.geeks.mathmatics;

public class GCDProblem {
    static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        int a = 1000000089, b = 1500078000;
        System.out.println("gcd via looping " + findGcd(a, b));
        System.out.println("gcd via euclidean  " + findGcdEuclidean(a, b));
        System.out.println("gcd via optimize euclidean  " + findGcdOptimizeEuclidean(a, b));
    }

    private static int findGcd(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        System.out.println("calculate time first:" + (System.currentTimeMillis() - startTime));
        return min;
/**
 * time complexity : O(min(a,b))
 */
    }

    private static int findGcdEuclidean(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("calculate time second:" + (System.currentTimeMillis() - startTime));

        return a;
    }


    private static int findGcdOptimizeEuclidean(int a, int b) {

        if (b == 0) {
            System.out.println("calculate time third:" + (System.currentTimeMillis() - startTime));
            return a;
        }
        return findGcdOptimizeEuclidean(b, a % b);
    }

}
