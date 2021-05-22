package com.kdroid.kotlintuts.geeks.bitwise;

public class BitWiseDemo1 {
    public static void main(String[] args) {
        int x=3;
        int y=6;
        System.out.println(x&y);
        System.out.println(x^y);
        System.out.println(x|y);

        /** x:  0......0011
         *  y:  0......0110
         *  ---------------
         *  x&y:0......0010
         *  mean 2

         */
    }
}
