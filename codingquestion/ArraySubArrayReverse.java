package com.kdroid.kotlintuts.codingquestion;

public class ArraySubArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 4;

        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            System.out.print(left+ " "+right+"\n");
            int tmp;
            while (left < right) {

                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left += 1;
                right -= 1;
            }

        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
