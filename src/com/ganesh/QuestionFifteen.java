package com.ganesh;

// Problem: WAP to Find Maximum Occurring Character in String.
// example String s = "sample string"
// output is : 's' = 2

import java.util.HashMap;
import java.util.Map;

public class QuestionFifteen {

    public static void main(String[] args) {
        String str = "sample string";
        getMaxOccurringCharacter(str);
    }

    public static void getMaxOccurringCharacter(String input){
        char maxOccurringChar = ' ';
        int maxFrequency = 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Counting each character's frequency
        for(char ch : input.toCharArray()){
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // finding the character with the maximum frequency.
        for(Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }
        // Displaying the result
        System.out.println("Maximum occurring character: '"+ maxOccurringChar + "' with a frequency of "+ maxFrequency);
    }
}

