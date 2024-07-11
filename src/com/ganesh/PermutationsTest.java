package com.ganesh;

// Problem:- WAP Find All the Permutations of a String
// Example:- String "abc"
// output:- "acb", "bac", "bca", "cab", and "cba"

public class PermutationsTest {
    public static void main(String[] args) {
        String test = "abc";
        getPermutations(test, "");
        System.out.println("All permutations of " + test + " have been displayed.");
    }

    public static void getPermutations(String input, String output){
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            getPermutations(remaining, output + ch);
        }
    }
}
