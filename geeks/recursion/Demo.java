package com.kdroid.kotlintuts.geeks.recursion;

/**
 * A recursion called itself
 * It must have base condition to stop the recursion
 */
public class Demo {
    public static void main(String[] args) {
        // fun1(4);
        // fun2(4);
        // fun3(3);
        //System.out.println(fun4(16));
        //fun5(7);
       // printReverseOrder(5);
       // System.out.println(findFactorialNumber(0));
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(printFibonacciSeries(i));
//        }

        System.out.println(sumOfNNumber(10));


    }

    private static void fun1(int n) {
        if (n == 0)
            return;
        System.out.println("GFG");
        fun1(n - 1);
    }

    private static void fun2(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun2(n - 1);
        System.out.println(n);
    }

    private static void fun3(int n) {
        if (n == 0)
            return;
        fun3(n - 1);
        System.out.println(n);
        fun3(n - 1);
    }


    private static int fun4(int n) {
        if (n == 1)
            return 0;
        else {
            return 1 + fun4(n / 2);
        }
    }

    private static void fun5(int n) {
        if (n == 0)
            return;
        fun5(n/2);
        System.out.println(n%2);
    }

    private static void printReverseOrder(int n)
    {
     if(n==0)
         return;
     System.out.println(n);
     printReverseOrder(n-1);
    }

    /**
     * WAP to find factorial of a number using via recursive
     * @param n is the number
     */
    private static int findFactorialNumber(int n){
        if(n==0)
            return 1;
        return n* findFactorialNumber(n-1);
    }
    private static int printFibonacciSeries(int n){
//        if(n==1)
//            return 1;
//        if(n==0)
//            return 0;
        if(n<=1)
            return n;
        return printFibonacciSeries(n-1)+printFibonacciSeries(n-2);
    }

    private static int sumOfNNumber(int n){
        if(n==0)
            return 0;
        return n+ sumOfNNumber(n-1);
    }


}
