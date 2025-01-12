package com.java8;

// Q. We have one map with a string key and Integer value needs to sort the map by value/key.
// using java 8.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortKeyAndValueInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 20);
        map.put("D", 5);
        map.put("C", 19);
        map.put("K", 55);
        map.put("E", 11);
        map.put("P", 30);
        System.out.println("Simple Map Result::"+ map);
        // output:- Simple Map Result::{P=30, A=20, C=19, D=5, E=11, K=55}

        // Sorted map based on value
        LinkedHashMap<String, Integer> sortedMapBasedOnValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map BasedOnValue::"+ sortedMapBasedOnValue);
        // output:- Sorted Map BasedOnValue::{D=5, E=11, C=19, A=20, P=30, K=55}

        // Sorted map based on key
        LinkedHashMap<String, Integer> sortedMapBasedOnKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map BasedOnKey::"+ sortedMapBasedOnKey);
        // output:- Sorted Map BasedOnKey::{A=20, C=19, D=5, E=11, K=55, P=30}
    }
}
