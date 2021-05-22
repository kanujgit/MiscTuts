package com.kdroid.kotlintuts.codingquestion;

import java.util.Scanner;

public class InnovativePrinting {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        String[][] twoD = new String[rows][columns];

        int counterPattern = 0;
        for (int i = 0; i < rows; i++) {
            counterPattern = 0;
            int printItemCount = sc.nextInt();
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    twoD[i][j] = "X";
                } else {
                    if (printItemCount == counterPattern++) {
                        twoD[i][j] = "X";
                        counterPattern = 0;
                    } else {
                        twoD[i][j] = "0";
                    }
                }
            }
        }
        System.out.print("\nPrinting pattern : \n");
        for (String[] x : twoD) {
            for (String y : x) {
                System.out.print(y);
            }
            System.out.println();
        }

    }
}

