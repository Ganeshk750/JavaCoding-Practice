package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        // Filter names starting with 'A' and convert to uppercase
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredName = names.stream().filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase()) // use method reference String::toUpperCase
                .collect(Collectors.toList());
        System.out.println("Filtered Name:: "+ filteredName);
    }
}
