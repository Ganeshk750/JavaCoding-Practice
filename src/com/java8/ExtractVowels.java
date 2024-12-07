package com.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractVowels {
    public static void main(String[] args) {
        String str = "English is popular language";
        String extractResult = extractingVowels(str);
        System.out.println("Vowel is present in given string: "+ extractResult);
    }

    private static String extractingVowels(String str) {
        return str.chars().sorted()
                .mapToObj(c -> (char) c)
                .filter(ele -> "aeiouAEIOU".indexOf(ele) != -1)
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
    }

}
