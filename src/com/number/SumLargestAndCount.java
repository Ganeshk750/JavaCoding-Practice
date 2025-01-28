package com.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumLargestAndCount {
    public static void main(String[] args) {
        sum();
        count();
        largestNumber();
    }
    public static void sum(){
        int inputNumber = 987;
        int sum = 0;
        if( inputNumber == 0){
            return;
        }
        while(inputNumber > 0){
            int temp = inputNumber % 10;
            inputNumber = inputNumber / 10;
            sum = sum + temp;
        }
        System.out.println(sum);
    }
    public static void count(){
        int inputNumber = 29845315;
        int count = 0;
        if(inputNumber == 0){
            return;
        }
        while(inputNumber > 0){
            count++;
            inputNumber = inputNumber / 10;
        }
        System.out.println("count: "+count);
    }
    public static void largestNumber(){
        List<Integer> list = Arrays.asList(12,22,54);
        System.out.println("Largest Number: "+Collections.max(list));
    }
}
