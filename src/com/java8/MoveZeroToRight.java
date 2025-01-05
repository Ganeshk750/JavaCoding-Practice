package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroToRight {
    public static void main(String[] args) {
        // Before Java 8
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(0);
            list.add(3);
            list.add(12);

            System.out.println("Before: " + list);
            moveZeroes(list);
            System.out.println("After: " + list);

//        List<Integer> numbers = List.of(-1,3,-6,0,5,-2,0,8,0,-4);
//        List<Integer> results = Stream.concat(numbers.stream().filter(n -> n != 0),
//                        numbers.stream().filter(n -> n == 0))
//                .collect(Collectors.toList());
//        System.out.println(results);

        // Using Java 8.
    }

    private static void moveZeroes(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(count, list.get(i));
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < list.size()) {
            list.set(count, 0);
            count++;
        }
    }


}
