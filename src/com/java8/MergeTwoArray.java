package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArray {
    public static void main(String[] args) {
        Integer arr1 [] = {1,2,3,4,5,6};
        Integer arr2 [] = {7,8,9,10,11};
        Integer[] mergedArray = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(mergedArray));

        //Using List
        List<Integer> ar1 = List.of(1,2,3,4,5,6,7);
        List<Integer> ar2 = List.of(8,9,10,11,12,13);
        List<Integer> mergedList = Stream.concat(ar1.stream(), ar2.stream()).collect(Collectors.toList());
        System.out.println(mergedList);
    }
}
