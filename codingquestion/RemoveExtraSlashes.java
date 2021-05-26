package com.kdroid.kotlintuts.codingquestion;

import java.util.HashMap;
import java.util.Set;

public class RemoveExtraSlashes {
    public static void main(String[] args) {
        int counter = 0;
        String str = "////as/sss/s///";
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/') {
                counter++;
                if (counter > 1) {
                    continue;
                }
                s.append(str.charAt(i));
                continue;
            }
            s.append(str.charAt(i));
            counter = 0;
        }
        System.out.println(s);
    }
}
