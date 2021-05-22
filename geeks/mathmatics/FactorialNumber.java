package com.kdroid.kotlintuts.geeks.mathmatics;

public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5;


        System.out.println("sum of " + usingLoop(number));
        System.out.println("fact of using rec " + recursionFact(number));
    }

    public static long usingLoop(int number) {
        long sum = 1;
        while (number > 0) {
            sum *= number;
            number--;
        }
        return sum;
    }

    private static long recursionFact(int n) {
        if (n == 0) {
            return 1;
        }
        return ((n) * recursionFact(n-1));

    }
}
