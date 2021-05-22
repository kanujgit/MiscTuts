package com.kdroid.kotlintuts.geeks.recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "e`";
        int start = 0, end = s.length() - 1;
        System.out.println(isPalindrome(s, start, end));
    }

    private static boolean isPalindrome(String str, int s, int e) {
        if (s >= e)
            return true;
        return ((str.charAt(s) == str.charAt(e)) && isPalindrome(str, s + 1, e - 1));
    }
}
