package com.string;

import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args) {
        String inputStrA = "Army";
        String inputStrB = "Mary";
        firstApproach(inputStrA, inputStrB);
    }
    public static void firstApproach(String strA, String strB){
        if(strA.length() == 0 || strB.length() == 0){
            return;
        }
        if(strA.length() == strB.length()){
            char charA [] = strA.toLowerCase().toCharArray();
            char charB [] = strB.toLowerCase().toCharArray();
            Arrays.sort(charA);
            Arrays.sort(charB);
           boolean result = Arrays.equals(charA, charB);
           if(result){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
        }

    }

}
