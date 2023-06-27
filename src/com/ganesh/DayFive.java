package com.ganesh;

// Problem:- WAP to map List to Map;
// example name list is [ganesh, aryan, prince] and number list is [26, 13, 12]
// output is {ganesh: 26, aryan: 13, prince: 12 }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DayFive {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ganesh");
        names.add("aryan");
        names.add("prince");
        System.out.println("Given Name List is : "+ names);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(26);
        numbers.add(13);
        numbers.add(12);
        System.out.println("Given Number List is : "+ numbers);
        Map<List<String>, List<Integer>> result = listToMapConversion(names,numbers);
        System.out.println("Final Map Result: "+ result);


        // Using Java 8
        IntStream.range(0, names.size()).boxed().
                collect(Collectors.toMap(names::get, numbers::get, (o,n) -> n))
                .forEach((key,value) -> System.out.println(key+"="+value));
    }

    private static Map<List<String>, List<Integer>> listToMapConversion(List<String> names, List<Integer> numbers) {
       Map<List<String>, List<Integer>> resultMap = new HashMap<>();
       resultMap.put(names, numbers);
       return resultMap;
    }


}
