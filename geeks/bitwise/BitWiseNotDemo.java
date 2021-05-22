package com.kdroid.kotlintuts.geeks.bitwise;

public class BitWiseNotDemo {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i < 12; i++) {
         //   System.out.println(~i);
        }

        leftShiftOperator(2);
        rightShiftOperator(3,2);

        /** x:  0......0001
         * ~x:  1......1110
         *  ---------------
         *  x&y:0......0010
         *  mean 2

         */

    }

    private static void leftShiftOperator(int shiftValue){

        /**      *
         *  x:  :0......0001
         * x<<1 :0......0010
         * x<<2 :0......0100
         *  ---------------
         *means last bit is ignored and shift all value to left
         * Generally use for multiplications
         * x left shifted by y
         * result is x*2^y
         */
        int x=3;
        System.out.println(x<<shiftValue);
    }
    private static void rightShiftOperator(int x ,int shiftValue){

        /**      *
         *  x:  :0......0101
         * x>>1 :1......0010
         * x>>2 :11.....0001
         *  ---------------
         *means right most bit is ignored and shift all value to right
         * Generally use for multiplications
         * x left shifted by y
         * result is x*2^y
         */

        System.out.println(x>>shiftValue);
    }
}
