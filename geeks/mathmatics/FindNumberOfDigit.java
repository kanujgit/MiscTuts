package com.kdroid.kotlintuts.geeks.mathmatics;

public class FindNumberOfDigit {
    public static void main(String[] args) {
        int n = 762;

        System.out.println("Total number is using recursion "+countRecursiveWay(n));
        System.out.println("Total number is using logarithmic "+ countUsingLogarithmic(n));
    }

    private static void usingLooping(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.print("Total number is:" + count);
    }

    private static int countRecursiveWay(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 + countRecursiveWay(number / 10);
        }
    }

    private static int countUsingLogarithmic(long n){

        return (int) Math.floor((Math.log10(n)+1));
    }
}
