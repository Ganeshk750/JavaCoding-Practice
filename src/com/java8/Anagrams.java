package com.java8;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
         String strOne = "Keep";
         String strTwo = "Peek";
        boolean result = isAnagramCheck(strOne, strTwo);
        System.out.println("Are the strings anagramsTest? " + result);
    }

    private static boolean isAnagramCheck(String strOne, String strTwo) {
        if(strOne.length() != strTwo.length()){
            return false;
        }
        return strOne.toLowerCase().chars()
                .sorted()
                .mapToObj(c -> (char)c).collect(Collectors.toList())
                .equals(strTwo.toLowerCase().chars().sorted().mapToObj(c -> (char)c).collect(Collectors.toList()));
    }
}
