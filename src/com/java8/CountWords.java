package com.java8;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String str = "English is popular language";
        long wordCounts = countWordFromString(str);
        System.out.println("Total Word Count is: "+ wordCounts);
    }

    private static long countWordFromString(String str) {
        return Arrays.stream(str.split(" ")).count();
    }
}
