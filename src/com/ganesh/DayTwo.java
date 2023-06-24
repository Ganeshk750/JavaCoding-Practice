package com.ganesh;

// Problem:- WAP to test given string is Palindromes or not.
// example RADAR, NOON, CIVIC, RACECAR are Palindrome string.

public class DayTwo {

    public static void main(String[] args) {

      String str = "RACECAR";
        Boolean result = isPalindrome(str);
        System.out.println("Given String is: "+ str);
        System.out.println("Given String is Palindrome: "+ result);

    }

    // Using StringBuilder
    private static boolean isPalindrome(String str){
       String reverse = new StringBuilder(str).reverse().toString();
       return str.equals(reverse);
    }
}
