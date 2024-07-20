package com.ganesh;

// Problem:- WAP to Find the First Non-repeated Character in a String.
// example String s = "Java World"
// output is 'J'

import java.util.LinkedHashMap;
import java.util.Map;

public class QuestionTwelve {

    public static void main(String[] args) {
         String words = "Java World";
         char result = getFirstNonRepeatedCharacter(words);
         if(result !='\0'){
             System.out.println("The First Non-repeated character is: "+ result);
         }else {
             System.out.println("All Character are repeated. ");
         }
    }

    public static char getFirstNonRepeatedCharacter(String input){
       // Step - I : Build a frequency count for each character
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
        for(char ch : input.toCharArray()){
            characterCountMap.put(ch, characterCountMap.getOrDefault(ch,0) + 1);
        }
        // Step - II : Find the first character with a count of 1
        for(char ch : input.toCharArray()){
            if(characterCountMap.get(ch) == 1){
                return ch;
            }
        }
        // return null character if all characters are repeated
        return '\0';
    }
}
