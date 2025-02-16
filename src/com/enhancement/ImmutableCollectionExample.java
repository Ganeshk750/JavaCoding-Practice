package com.enhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImmutableCollectionExample {

    public static void main(String[] args) {

        var list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        List<Integer> objectList = list.stream()
                .filter((number) -> number % 2 == 0).collect(Collectors.toUnmodifiableList());
        //objectList.add(500); // java.lang.UnsupportedOperationException

        List<Integer> newList = List.copyOf(objectList);
        System.out.println(newList);

    }
}
