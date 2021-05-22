package com.kdroid.kotlintuts.geeks.bitwise;

/**
 * Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
 * Note: If there is no set bit in the integer N, then return 0 from the function
 * Example 1:
 * ------------------------
 * Input: N = 18
 * Output: 2
 * Explanation: Binary representation of
 * 18 is 010010,the first set bit from the
 * right side is at position 2.
 */
public class FirstSetBit {
    public static void main(String[] args) {
        int n = 0;
//        for (int i = 1; i <= n; i++) {
//            if ((n & i) == 0) {
//                n = n >> 1;
//            }
//        }
        int m = 1;
        int position = 1;
        while ((n & m) == 0) {
            m = m << 1;
            position++;
        }

        System.out.println(position);
    }
}
