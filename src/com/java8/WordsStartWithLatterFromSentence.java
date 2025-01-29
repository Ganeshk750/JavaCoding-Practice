package com.java8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 problem:- we hava one string sentences with multiple words that finds the words which starts with 'b'
  input:- "apple banana mango box been fox auto bike"
  output:- [banana, box, been, bike]
* */
public class WordsStartWithLatterFromSentence {
    public static void main(String[] args) {
        String inputStr = "apple banana mango box been fox auto bike";
        firstApproach(inputStr);
    }
    public static void firstApproach(String inputStr){
        if(inputStr.length() == 0){
            return;
        }
        String[] stringArr = inputStr.split(" ");
        List<String> wordsStartWithB = Arrays.asList(stringArr)
                .stream()
                .filter(ele -> ele.toLowerCase().startsWith("b"))
                .collect(Collectors.toList());
        System.out.println("Word Start with 'b' is: "+ wordsStartWithB);
    }
}
