package com.optional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreams {
    public static void main(String[] args) {
        // 1. Stream() :- It allows us to process data in a pipeline
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Stream<String> nameStream = names.stream();
        // 2. filter :- Keep Only what you need. and filter elements based on a condition.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> evenPredicate = (n) -> n % 2 == 0;
        List<Integer> evenNumber = numbers.stream().filter(evenPredicate)
                .collect(Collectors.toList());
        System.out.println(evenNumber);

        // 3. map:- Transform each element. Used to modify each element in a stream
        List<String> upperCaseNameList = names.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNameList);

        // 4. flatMap - flatten Nested Structures.
        List<List<String>> listOfList = List.of(List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F"));
        List<String> flatList = listOfList.stream().flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
       // 5. forEach = Iterate Over Elements. Executes an action for each element
        // note:- should not be used to modify data within the stream. prefer map for transportation.
        List.of("Java", "Streams", "API").forEach(System.out::println);

        //6. sorted - sort elements. sort elements based on natural order or a custom comparator.
        List<Integer> numberList = List.of(5,3,8,1);
        List<Integer> sortedNumber = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);
        List<Integer> reverseSorting = numberList.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse Sorting: "+ reverseSorting);
        // 7. reduce - combine one element to one value. used to aggregate result like sum
        // max or concatenation
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // 8. distinct - Remove duplicates. eliminates duplicate value form a stream
        List<Integer> setNumbers = List.of(1, 2, 2, 2, 5, 5, 6, 7);
        List<Integer> uniqueNumber = setNumbers.stream().distinct().toList();
        System.out.println("Unique Number List: "+ uniqueNumber);

        // 9. limit & skip :- control elements processed and limit the number of elements or skip a certain amount.
        List<Integer> limited = numberList.stream().limit(3).toList();
        System.out.println(limited);
        List<Integer> skipList = Stream.of(1, 2, 3, 4, 5, 6).skip(3).toList();
        System.out.println("Skip List: "+ skipList);

        /*
        *  10. Matching Operators: anyMatch, allMatch, noneMatch
        *  these operators are used to check if nay all or none of the elements in
        *  a stream match a given condition. they return a boolean value.
        *
        *   anyMatch - Return true if at least one element matches the condition.
        *   allMatch - Return true if all elements match the condition.
        *   noneMatch - Return true if none of the elements match the condition.
        * */
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("anyMatch: "+ anyMatch);
        boolean allMatch = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("allMatch : "+ allMatch);
        boolean noneMatch = names.stream().noneMatch(name -> name.startsWith("Z"));
        System.out.println("noneMatch: "+ noneMatch);


    }
}
