package com.kdroid.kotlintuts.codingquestion;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class MatrixRotation {

    public static void main(String[] args) {
        int N = 4;
        // Test Case 1
        int mat[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Tese Case 2
//        int mat[][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };


        // Tese Case 3
        /*int mat[][] = {
                        {1, 2},
                        {4, 5}
                    };*/

        // displayMatrix(mat);

        rotateMatrix(N, mat);

        // Print rotated matrix
        displayMatrix(N, mat);
    }

    // Function to print the matrix
    static void displayMatrix(
            int N, int mat[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                        " " + mat[i][j]);
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    static void rotateMatrix(
            int N, int mat[][]) {
        for (int x = 0; x < N / 2; x++) {

            for (int y = x; y < N - x - 1; y++) {
                if (!(x == 0 && y == 0)) {
                    int temp = mat[x][y];
                    mat[x][y] = mat[y][N - 1 - x];
                    mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];
                    mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
                    mat[N - 1 - y][x] = temp;
                }

            }
        }
    }
}
