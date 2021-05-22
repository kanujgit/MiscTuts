package com.kdroid.kotlintuts.geeks.mathmatics;

public class TrailingZeroFactorialNumber {
    public static void main(String[] args) {
        int n = 2951;
        //  System.out.println("Total zero is : " + countZero(n));
        System.out.println("Total zero is for : " + countZeroUsingFormula(n));
    }

    private static int countZero(int n) {
        int fact = 1;
        int countZero = 0;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        while (fact % 10 == 0) {
            countZero++;
            fact = fact / 10;
        }
        return countZero;
    }

    private static int countZeroUsingFormula(int n) {
        int sum = 0;
        int mult = 5;
        while (mult <= n) {
            sum += n / mult;
            mult = mult * 5;
            System.out.println("sum "+sum);
        }
//        for (mult = 5; mult <= n; mult = mult * 5) {
//            sum += n / mult;
//        }
//        return sum;
        return sum;
    }

}
