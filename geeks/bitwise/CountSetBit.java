package com.kdroid.kotlintuts.geeks.bitwise;

/**
 * count set bit , how many set in binary representation
 * n=13
 * Binary Rep: 0......01101
 * set bit is : 3
 */

public class CountSetBit {
    static int[] table = new int[256];

    public static void main(String[] args) {
        int n = 40;
        countSetBit(n);
        countSetBitByBrian(n);
        countSetBitOOne(n);
    }

    //knive Solution

    /**
     * comp: o(total no bits)
     *
     * @param n
     */
    private static void countSetBit(int n) {

        int res = 0;
        while (n > 0) {
//            if ((n % 2 != 0)) {
//                res++;
//            }
//            n =n/2;
// --------------------------------------
            // using bit wise operator
// --------------------------------------
            if ((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        System.out.println(" total set bit is " + res);
    }

    /**
     * Brian kernighan solutions
     * <p>
     * n=40:  101000   (n)
     * &
     * n=39:  100111   (n-1)
     * ---------------
     * n=32:  100000
     * compex: o(no of set bit)
     */
    private static void countSetBitByBrian(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        System.out.println("total set bit by using brian: " + res);
    }

    private static void countSetBitOOne(int n) {
        init();
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        System.out.println("total set bit by using O(1): "+res);
    }


    private static void init() {
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }
}
