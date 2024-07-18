package com.ganesh;

import java.util.LinkedHashMap;
import java.util.Map;

// Given String s = "001xyz002xy003x"
// output :  key   value
//           001   xyz
//           002   xy
//           003   x
public class StringToKeyValue {

    public static void main(String[] args) {
        String s = "001xyz002xy003x";
        System.out.println("Input String is: "+ s);
        System.out.println("Output:- ");
        firstApproach(s);
        System.out.println("---------------------");
        secondApproach(s);

    }

    private static void secondApproach(String input) {
        Map<String, String> output = new LinkedHashMap<>();
        int n = input.length();
        int i = 0;
        while( i < n){
            String digit = "";
            String alphabet = "";
            while( i < n && Character.isDigit(input.charAt(i))){
                digit = digit + input.charAt(i);
                i++;
            }
            while (i < n && Character.isAlphabetic((input.charAt(i)))){
                alphabet = alphabet + input.charAt(i);
                i++;
            }
            output.put(digit, alphabet);
        }
        System.out.println(output);
    }

    public static void firstApproach(String input){
        int keyLen = 3;
        int valueLen = 3;
        System.out.println("key\tvalue");
        System.out.println("==========");
        for(int i = 0; i < input.length(); i++){
            String key = input.substring(i,i+keyLen);
            i = i + keyLen;
            String value = input.substring(i, i+valueLen);
            valueLen --;
            i = i + valueLen;
            System.out.println(key+"\t"+value);
        }
    }

}
