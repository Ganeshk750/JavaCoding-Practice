package com.ganesh;

// Problem: WAP to Find Duplicate Characters in a String.
// example String s = "Java World"
// output is 'a'

import java.util.HashMap;
import java.util.Map;

public class QuestionThirteen {

    public static void main(String[] args) {

        String text = "Java Wold";

        System.out.println("Duplicate characters in the string are: ");
        getDuplicateCharacter(text);
    }

    public static void getDuplicateCharacter(String input){
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
