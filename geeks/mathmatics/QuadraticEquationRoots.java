package com.kdroid.kotlintuts.geeks.mathmatics;

import java.util.ArrayList;

/**
 * Given a quadratic equation in the form ax2 + bx + c. Find its roots.
 * Example 1:
 * Input:
 * a = 1
 * b = -2
 * c = 1
 * Output: 1 1
 * Explanation:
 * Roots of equation x2-2x+1 are 1 and 1.
 */
public class QuadraticEquationRoots {
    public static void main(String[] args) {
        //752 904 164
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers = quadraticRoots(752, 904, 164);
        for (Integer i : numbers
        ) {
            System.out.println(i + " ");

        }

    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        //x = [ -b plus minus square root of (b^2-4ac) ] / 2a
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        if (Math.sqrt(Math.pow(b,2)-4*a*c) < 0) {
            numbers.add(-1);
        } else {
          //  Math.pow(Math.pow(b,2)-4*a*c,1/2.0)
           int x = (int) ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
            int y = (int) ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
            numbers.add(x);
            numbers.add(y);
        }
        return numbers;
    }
}
