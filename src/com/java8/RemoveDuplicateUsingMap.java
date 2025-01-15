package com.java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingMap {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5,2,4,9);
        Set<Integer> res = numbers.stream()
                .collect(Collectors.groupingBy(ele -> ele, Collectors.counting()))
                .entrySet().stream()
                .filter(ele -> ele.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(res);

        List<Integer> nums = List.of(2,3,4,5,4,2,3,9);
        Set<Integer> removedDuplicateList = nums.stream().collect(Collectors.toSet());
        System.out.println(removedDuplicateList);
        List<Integer> resList = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(resList);
    }
}
