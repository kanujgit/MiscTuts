    package com.kdroid.kotlintuts.geeks.bitwise;

public class KthBitSetOrNot {
    public static void main(String[] args) {
        int k = 3, n = 5;
        bitSetOrNot(n, k);
        bitSetOrNotMethod2(n, k);

    }

    private static void bitSetOrNotMethod2(int n, int k) {
        int shiftedNoByN = n >> (k - 1);
        if((shiftedNoByN & 1)!=0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static void bitSetOrNot(int n, int k) {
        /** x:            0......0101
         *  (1<<(k-1)):   0......0100
         *  ------------------------------------
         *  x&(1<<(k-1)):0......0100
         *  mean Yes
         *bitwise end
         */
        if ((n & (1 << (k - 1))) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
