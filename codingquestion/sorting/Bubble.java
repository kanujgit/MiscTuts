package com.kdroid.kotlintuts.codingquestion.sorting;

public class Bubble {


    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 30, 42, 15, 26, 77, 8};
        int tmp = -1;
        long  endTime=-1;
        long time =-1;
        long startTime =System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i : arr
        ) {

            endTime =System.currentTimeMillis();
            time= endTime-startTime;
            System.out.print(i + " ");

        }
        System.out.print(time + " ok ");
    }

}
