package com.kdroid.kotlintuts.java.datastructure.stack;

import java.util.Stack;

/**
 * Problem: Given an array of characters formed with a’s and b’s. The string is marked with
 * special character X which represents the middle of the list (for example: ababa...ababXbabab baaa).
 * Check whether the string is palindrome.
 * <p>
 * Solution:This is one of the simplest algorithms. What we do is, start two indexes, one at the
 * beginning of the string and the other at the end of the string. Each time compare whether the values
 * at both the indexes are the same or not. If the values are not the same then we say that the given
 * string is not a palindrome.
 */
public class PalindromeStringWithSpacialChar {

    public static void main(String[] args) {
        String str = "abcdXdcbas";
        //checkPalindromes(str);
        checkPalindromesUsingStack(str);
    }

    /**
     * Time Complexity : O(N)
     * Space : O(1)
     */
    private static void checkPalindromes(String str) {

        int i = 0;
        int j = str.length() - 1;
        while (i < j && str.charAt(i) == str.charAt(j)) {
            i++;
            j--;
        }
        if (i < j) {
            System.out.println("Not Palindromes");
        } else {
            System.out.println("Palindromes");
        }
    }

    private static void checkPalindromesUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (str.charAt(i) != 'X') {
            stack.push(str.charAt(i));
            i++;
        }
        i++;
        for (int j = i; i < str.length(); j++) {
            if (stack.pop() != str.charAt(j)) {
                System.out.println("Not");
                return;
            }
            i++;
        }
        if (stack.isEmpty()) {
            System.out.println("Yes");
        }


    }


}
