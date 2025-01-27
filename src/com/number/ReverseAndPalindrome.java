package com.number;

import java.util.stream.Collectors;

/*
* A palindrome is a word, phrase, number, or any sequence of characters that reads
* the same forward and backward (ignoring spaces, punctuation, and capitalization).

Some examples of palindromes:
Words: "radar", "level", "madam"
Phrases: "A man, a plan, a canal, Panama" (ignoring spaces, commas, and capitalization)
Numbers: 121, 12321
* input: 12321 output:- 12321
* */
public class ReverseAndPalindrome {
    public static void main(String[] args) {
        approachIst();
        approach2nd();
    }

    private static void approach2nd() {
        int number = 12321;
        int initialNo = number;
        int rev = 0,temp;
        while(number > 0){
            temp = number % 10;
            rev = (rev * 10) + temp; //
            number = number / 10;
        }
        checkResult(rev, initialNo);
    }

    public static void approachIst(){
        int number = 12321, temp;
        int initialNo = number;
        String res ="";
        if(number == 0){
            return;
        }
        while(number > 0){
            temp = number % 10;
            number = number / 10;
            res = res.concat(String.valueOf(temp));
        }
        int reverse = Integer.parseInt(res);
        checkResult(initialNo, reverse);

    }
    public static void checkResult(int num1, int num2){
        if(num1 == num2){
            System.out.println("Palindrome: "+ "Yes");
        }else {
            System.out.println("Palindrome: "+ "No");
        }
    }

}
