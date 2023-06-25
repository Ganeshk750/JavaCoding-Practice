package com.ganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Problem:- WAP to check given two string are Anagrams or not.
// example "face" , "cafe"  --> Yes

public class DayThree {
    public static void main(String[] args) {
       String str = "face";
       String str1 = "cafe";
       boolean result = isAnagram(str, str1);
       System.out.println("Given Two String is: "+ str + ":&:"+ str1);
       System.out.println("Result: "+ result);
    }

    private static boolean isAnagram(String str, String str1){
        List<String> wordList1 = new ArrayList<>(Arrays.asList(str.split("")));
        List<String> wordList2 = new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(wordList1);
        Collections.sort(wordList2);

        str = String.join("", wordList1);
        str1 = String.join("", wordList2);

        return str.equals(str1);
    }
}
