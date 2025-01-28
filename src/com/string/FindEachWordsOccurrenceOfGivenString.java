package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEachWordsOccurrenceOfGivenString {
    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        //output:- {"Alice": 1, "is": 2, "girl": 1,"Bob": 1, "and": 1,"boy": 1}
        firstApproach(str);
        approachSecond(str);
    }
    public static void firstApproach(String str){
        if(str.length() == 0){
            return;
        }
        String [] wordArr = str.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();
        for(String word: wordArr){
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            }else{
                wordMap.put(word, 1);
            }
        }
        System.out.println("Word Map: "+ wordMap);
        // Sorting Based On Key
        System.out.println("Sorted Map Based On Keys:: ");
        wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(key, value) -> key, LinkedHashMap::new))
                .entrySet()
                .stream()
                .forEach(System.out::println);
     }
     public static void approachSecond(String str){
        if(str.length() == 0){
            return;
        }
         Map<String, Long> wordMap = Arrays.asList(str.split(" ")).stream()
                 .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
         System.out.println("Word Map using Java 8::"+ wordMap);
     }
}
