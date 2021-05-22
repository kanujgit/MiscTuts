package com.kdroid.kotlintuts.geeks.mathmatics;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n = 121;
        int numb= n;
        int newNumber = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            newNumber = rem + newNumber * 10;
        }
        if (newNumber == numb) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
