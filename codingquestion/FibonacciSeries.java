package com.kdroid.kotlintuts.codingquestion;

import java.util.ArrayList;

public class FibonacciSeries {
    public static void main(String[] args) {
        int inputNumber = 50;  // declare the total number list

        int first = 0;// init first item
        int second = 1; // init second item
        int third = 0; // init third

        ArrayList<Integer> arr = new ArrayList<>();  // declare the list for get non fabbonaci series
        for (int i = 0; i <= inputNumber; i++) {
            while (third < i) {
                third = first + second;
                first = second;
                second = third;
            }
            if (third != i) {
                arr.add(i);
            }
        }

        // printing the non FibonacciSeries
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}

