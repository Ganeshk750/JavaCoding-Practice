package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Problem:- WAP to count the occurrence of each character in string.
// Example:- String "ilovejavaprogramming"
// output:- {p=1, a=3, r=2, e=1, v=2, g=2, i=2, j=1, l=1, m=2, n=1, o=2}
public class CountOfLetter {
    public static void main(String[] args) {

        String str = "ilovejavaprogramming";
        //STEP 1. convert string to char array i.e ["i","l",...]
        char [] inputChar = str.toCharArray();
        // OR
        String[] inputStr = str.split("");
        System.out.println(Arrays.toString(inputChar));
        System.out.println(Arrays.toString(inputStr));

        // STEP 2. Now Make Char Array to Stream

        Map<String, List<String>> stringCollect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s));

        System.out.println(stringCollect);
        //{p=[p], a=[a, a, a], r=[r, r], e=[e], v=[v, v], g=[g, g], i=[i, i], j=[j], l=[l], m=[m, m], n=[n], o=[o, o]}

        Map<String, Long> finalResult = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(finalResult);
        //{p=1, a=3, r=2, e=1, v=2, g=2, i=2, j=1, l=1, m=2, n=1, o=2}
    }
}
