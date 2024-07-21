package com.ganesh;

// Problem: WAP to Find Duplicate Characters in a String.
// example String s = "123456"
// output is true

public class QuestionFourteen {

    public static void main(String[] args) {

        String input = "34568789";
       // boolean result = firstApproach(input);
       // boolean result = secondApproach(input);
        boolean result = usingStreamAPI(input);
        System.out.println("Does the string contains only digits? :"+ result);
    }
    // 1. Using Loops
    public static boolean firstApproach(String input){
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                return false;
            }
        }
        return true;
    }
    // 2. Using Regular Expressions
    public static boolean secondApproach(String input){
        return input.matches("\\d+");
    }

    // 3. Using Java 8 Stream API
    public static boolean usingStreamAPI(String input){
        return input.chars().allMatch(Character::isDigit);
    }
}
