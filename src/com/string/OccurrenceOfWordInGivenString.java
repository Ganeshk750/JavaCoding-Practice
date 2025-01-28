package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfWordInGivenString {
    public static void main(String[] args) {
        String str = "Java is programming language. Java is widely used in software Testing";
        // input: "Java", output: 2
       // approachFirst(str);
        approachSecond();
        // Using Java 8;
        Arrays.asList(str.split(" ")).stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .entrySet()
                .stream().filter(ele -> ele.getKey().equalsIgnoreCase("java"))
                .forEach(System.out::println);

    }
    public static void approachFirst(String str){
        String [] wordArr = str.split(" ");
        System.out.println(Arrays.toString(wordArr));
        HashMap<String, Integer> wordMap = new HashMap<>();
        for(String word: wordArr){
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            }else{
                wordMap.put(word, 1);
            }
        }
        System.out.println(wordMap);
        wordMap.forEach((key, value) -> {
            if(value > 1){
                if(key.equalsIgnoreCase("Java")){
                    System.out.println(key+"::"+ value);
                }

            }
        });
    }

    public static void approachSecond(){
        String str = "Java is programming language. Java is widely used in software Testing";
        String [] strArr = str.toLowerCase().split(" ");
        String word = "java";
        int occurrence = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals(word)){
                occurrence++;
            }
        }
        System.out.println(occurrence);
    }
}
