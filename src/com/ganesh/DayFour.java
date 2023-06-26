package com.ganesh;

// Problem:- WAP to Extract anagrams from list
// example ["face", "caffe", "cafe", "milk", "limk", "abc"]
// output:- [milk, limk] [face, cafe]

import java.util.*;

public class DayFour {

    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("face", "caffe", "cafe", "milk", "limk", "abc");
        System.out.println("Given List is: "+ wordList);
        extractAnagramsFormList(wordList);
    }

    private static void extractAnagramsFormList(List<String> wordList){
        Map<String, List<String>> map = new HashMap<>();
        wordList.forEach(word -> map.put(anagramize(word), listWords(word, map)));
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            System.out.println("Key: "+ entry.getKey() + " : word : "+ entry.getValue());
        }
        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            if(entry.getValue().size() > 1){
                System.out.println(entry.getValue());
            }
        }
    }

    private static String anagramize(String word){
        List<String> listWord = new ArrayList<>(Arrays.asList(word.split("")));
        Collections.sort(listWord);
        return String.join("", listWord);
    }

    private static List<String> listWords(String word, Map<String, List<String>> map){
       List<String> arrayList = map.getOrDefault(anagramize(word), new ArrayList<>(Arrays.asList()));
       arrayList.add(word);
       return arrayList;
    }


}
