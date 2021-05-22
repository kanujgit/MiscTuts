package com.kdroid.kotlintuts.codingquestion.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int findItem = 8;
        int low = 0;
        int high = arr.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (findItem == arr[mid]) {
                System.out.println("mid item is " + mid);
                break;
            } else if (findItem > arr[mid]) {
                low = mid + 1;
                System.out.println("low is .. " + low);
            } else if (findItem < arr[mid]) {
                high = mid - 1;
                System.out.println("high is .. " + high);
            }
        }
        System.out.println("item found at index  " + mid);

    }
}
