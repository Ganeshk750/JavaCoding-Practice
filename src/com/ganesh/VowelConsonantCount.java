package com.ganesh;

// Problem:- WAP to Count Vowels and Consonants in a String
// Example:- String "Hello World"
// output:- Number of vowels: 3, Number of consonants: 7

public class VowelConsonantCount {

    public static void main(String[] args) {
        String input = "Hello World";
        int[] counts = vowelsAndConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    public static int[] vowelsAndConsonants(String input) {
        int vowelsCount = 0, consonantsCount = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Ensure character is a letter
                if ("aeiou".indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        return new int[]{vowelsCount, consonantsCount};
    }
}
