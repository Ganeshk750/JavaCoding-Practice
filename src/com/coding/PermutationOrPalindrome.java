package com.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PermutationOrPalindrome {
    public static void main(String[] args) {
        // ababcc - true // abac - false
        String str = "abababa";
        boolean result = isPermutationOrPalindrome(str);
        System.out.println("PermutationOrPalindrome Test is: "+ result);
    }

    private static boolean isPermutationOrPalindrome(String str) {
        int length = str.length();
        AtomicInteger oddCount = new AtomicInteger();
        if(length > 0){
            char[] chars = str.toCharArray();
            Map<Character, Integer> resultMap = toCharArrayToMap(chars);
            resultMap.entrySet().forEach(key -> {
                if(key.getValue() % 2 == 1){
                    oddCount.incrementAndGet();
                }
            });
        }
        if(oddCount.get() <= 1){
            return true;
        } else {
            return false;
        }
    }
    private static Map<Character, Integer> toCharArrayToMap(char [] chars){
        HashMap<Character,Integer> characterMap = new HashMap<>();
        for(Character ch: chars){
            if(characterMap.containsKey(ch)){
                characterMap.put(ch, characterMap.get(ch) + 1);
            }else{
                characterMap.put(ch, 1);
            }
        }
        return characterMap;
    }
}
