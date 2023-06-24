package com.ganesh;

// Problem:- WAP to test given string is Palindromes or not.
// example RADAR, NOON, CIVIC, RACECAR are Palindrome string.

// Problem:- WAP to test numberPalindrome.
// example 10101 -- Yes , 1011 -- No

public class DayTwo {

    public static void main(String[] args) {

      String str = "RACECAR";
      int num = 10101;
        Boolean result = isPalindrome(str);
        System.out.println("Given String is: "+ str);
        System.out.println("Given String is Palindrome: "+ result);
        System.out.println("Given Number is: "+ num);
        Boolean numberResult = numberPalindrome(num);
        System.out.println("Given Number is Palindrome: "+ numberResult);
    }

    // Using StringBuilder
    private static boolean isPalindrome(String str){
       String reverse = new StringBuilder(str).reverse().toString();
       return str.equals(reverse);
    }

    private static boolean numberPalindrome(int number){
        int temp = number;
        int rev = 0;
        while(number > 0){
            int dig = number % 10;
            rev = rev * 10 + dig;
            number = number / 10;
        }
        return temp == rev;
    }
}
