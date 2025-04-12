package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonItemInTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> mapOne = new HashMap<>();
        mapOne.put("a",1);
        mapOne.put("b",2);
        mapOne.put("c",3);
        mapOne.put("d",4);
        Map<String, Integer> mapTwo = new HashMap<>();
        mapTwo.put("b",2);
        mapTwo.put("c",3);
        mapTwo.put("e",5);
        System.out.println("Map One: "+ mapOne);
        System.out.println("Map Two: "+ mapTwo);
        Map<String, Integer> commonMap = mapOne.entrySet().stream()
                .filter(ele -> mapTwo.containsKey(ele.getKey()))
                .collect(Collectors.toMap(ele -> ele.getKey(), ele -> ele.getValue()));
        System.out.println("commonMap: "+ commonMap);
    }
}
