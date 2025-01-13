package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/* 1.Q Find frequency of each character
*  2.Q First more than one frequency of character
*  3.Q First non repeating character */
public class UsingMap {
    public static void main(String[] args) {
      // 1 . Frequency of each character
        System.out.println("Without java 8 | Frequency of each character:: "+ getCharacterFrequency("Ganesh Kumar"));
        System.out.println("Using java 8 | Frequency of each character:: "+ getCharacterFrequencyUsingJava8("Ganesh Kumar"));
      // 2. More than one frequency | without java 8
        Map<Character, Integer> moreThenOneMap = getCharacterFrequency("Ganesh kumar");
        moreThenOneMap.forEach((key, value) -> {
            if(value > 1){
                System.out.println(key+"::"+ value);
            }
        });
        System.out.println("Using java 8 | More than one frequency::: "+ getMoreThenOneCharacterFrequencyUsingJava8("Ganesh Kumar"));
        // 3. First non repeating character

        System.out.println("Without java 8 | First no repeating character:: ");
        LinkedHashMap<Character, Integer> linkedHashMap = getFirstNonRepeatingCharacter("Ganesh Kumar");
        Map.Entry<Character, Integer> entry = linkedHashMap.entrySet().stream().filter(ele -> ele.getValue() == 1).findFirst().get();
        System.out.println("First Non Repeating Character ::"+ entry.getKey() + "==>"+ entry.getValue());
        System.out.println("Using java 8 | First non repeating character:: "+ getFirstNonRepeatingCharacterUsingJava8("Prince"));

    }
    public static Map<Character, Integer> getCharacterFrequency(String str){
        str = str.replaceAll("\\s", "");
        if(str.length() == 0){
            return null;
        }
        char[] chars = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(Character ch: chars){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            } else{
                charMap.put(ch, 1);
            }
        }
        return charMap;
    }
    public static Map<Character, Long> getCharacterFrequencyUsingJava8(String str){
        str = str.replaceAll("\\s", "");
        Map<Character, Long> charMaps = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charMaps;
    }
    public static Character getMoreThenOneCharacterFrequencyUsingJava8(String str){
        str = str.replaceAll("\\s", "");
        Character character = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey)
                .findAny().get();
        return character;
    }

    public static LinkedHashMap<Character, Integer> getFirstNonRepeatingCharacter(String str){
        str = str.replaceAll("\\s", "");
        LinkedHashMap<Character, Integer> linkedCharMap = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();
        for(Character ch: charArr){
            if(linkedCharMap.containsKey(ch)){
                linkedCharMap.put(ch, linkedCharMap.get(ch) + 1);
            }else{
                linkedCharMap.put(ch, 1);
            }
        }
        return linkedCharMap;
    }

    public static Character getFirstNonRepeatingCharacterUsingJava8(String str){
        str = str.replaceAll("\\s", "");
        Character character = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(value -> value.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
        return character;
    }
}
