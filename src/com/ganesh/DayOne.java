package com.ganesh;

// Toggle Case Of Characters in a String

// Problem:- WAP to toggle the case of every character in a given string. For example ,
// if  the input string  is "GaNEsh" , the program output "gAneSH".

import java.util.Arrays;
import java.util.List;

public class DayOne {
    public static void main(String[] args) {

        String inputStr = "GaNEsh";
        String outPutStr = toggleCase(inputStr);
        System.out.println("Input String is : " + inputStr);
        System.out.println("OutPut String is : " + outPutStr);
    }

    private static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

}


