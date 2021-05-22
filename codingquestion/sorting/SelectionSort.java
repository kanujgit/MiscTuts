package com.kdroid.kotlintuts.codingquestion.sorting;

/**
 * if we have 8 pair of shoes , First we check the small no ,then we next proceed
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 30, 42, 15, 26, 77, 8};
        int min = arr[0];

        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            int miIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                // find minimum value of array
                if (arr[j] < arr[miIndex]) {
                    miIndex = j;
                }
            }
            //swap value
            tmp = arr[miIndex];
            arr[miIndex] = arr[i];
            arr[i] = tmp;
        }
        for (int i : arr
        ) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
