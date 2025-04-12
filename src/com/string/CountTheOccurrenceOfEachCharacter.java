package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "This is an example";
        firstApproach(str);
        secondApproach(str);
    }
    public static void firstApproach(String str){
        if(str.length() == 0){
            return;
        }
        char charArr [] = str.replaceAll("\\s", "").toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(Character ch: charArr){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else{
                charMap.put(ch, 1);
            }
        }
        System.out.println("Count Of Each Character: ");
        charMap.forEach((key, value) ->{
            System.out.println(key+"::"+ value);
        });
        System.out.println("Using Java 8:::");
    }
    public static void secondApproach(String str){
        if(str.length() == 0){
            return;
        }
        str.replaceAll("\\s","").chars()
                .mapToObj(ele -> (char) ele)
                .collect(Collectors.groupingBy(ele -> ele, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);
    }
}
