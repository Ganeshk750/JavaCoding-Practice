package com.number;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
  Print Prime numbers between 1 and 100.
* */
public class PrintPrimeNoWithRange {
    public static void main(String[] args) {
        approachFirst();
    }
    public static void approachFirst(){
        IntStream.rangeClosed(1,100).filter(ele -> (ele % 2 != 0 && ele / ele == 1)
                        && IntStream.rangeClosed(2, (int)Math.sqrt(ele))
                .noneMatch(i -> ele % i ==0))
                .forEach(System.out::println);
    }
}
