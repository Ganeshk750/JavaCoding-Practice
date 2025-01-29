package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Java Stream API is very good concept";
        // output: a
        char firstRepeatedCharacter = input.toLowerCase()
                .replaceAll("\\s", "")
                .chars()
                .mapToObj(ele -> (char) ele)
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ele -> ele.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println("First Repeated Character is :"+ firstRepeatedCharacter);

    }
}

