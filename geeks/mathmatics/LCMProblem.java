package com.kdroid.kotlintuts.geeks.mathmatics;

public class LCMProblem {
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println("lcm is: " + findLcm(a, b));
        System.out.println("optimize hcf is: " + findOpineWayToFindLcd(a, b));
    }

    private static int findLcm(int a, int b) {
        int maxNumber = Math.max(a, b);
        while (true) {
            if (maxNumber % a == 0 && maxNumber % b == 0) {
                break;
            }
            maxNumber++;
        }
        return maxNumber;
    }

    /**
     * O(a*b)
     */

    private static int findOpineWayToFindLcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }
}
