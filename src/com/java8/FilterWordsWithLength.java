package com.java8;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

/*
*  WAP to group a list of string based on their lengths and count the number of string in each group.
*  example ["dog", "cat","elephant","rabbit", "fox","owl","ant","zebra","giraffe"]
*  output:-
*  String of length 3: String eg:- dog cat fox owl....
*  String of length 4: String eg:- zebra....
*  String of length 6: String eg:- rabbit...
* */
public class FilterWordsWithLength {
    public static void main(String[] args) {
        // 1. Using java 8
        List<String> stringList = Arrays.asList("dog", "cat", "elephant", "rabbit", "fox", "owl", "ant", "zebra", "giraffe");
        Map<Integer, Long> collectedResult = stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        collectedResult.forEach((length, count) -> System.out.println("String of length "+ length + ": " + count));

        // 2.
        Map<Integer, Integer> groupByLength = new HashMap<>();
        for(String str: stringList){
            groupByLength.put(str.length(),groupByLength.getOrDefault(str.length(),0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : groupByLength.entrySet()){
            System.out.println("String of length "+ entry.getKey() + ": "+ entry.getValue());
        }

    }
}
