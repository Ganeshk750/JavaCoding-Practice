package com.ganesh;

// Problem: WAP to Find Duplicate Characters in a String.
// example String s = "123456"
// output is true

public class QuestionFourteen {

    public static void main(String[] args) {

        String input = "34568789";
        boolean result = firstApproach(input);
        System.out.println("Does the string contains only digits? :"+ result);
    }

    public static boolean firstApproach(String input){
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
