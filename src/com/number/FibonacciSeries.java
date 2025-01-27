package com.number;

import java.util.stream.Stream;

/* In FibonacciSeries, next number is the sum of previous two numbers.
 input:- first 10 numbers
 output:- 0,1,1,2,3,5,8,13,21,34,55 etc
* */
public class FibonacciSeries {
    public static void main(String[] args) {
       int num1=0, num2=1, num=10;
       for(int i = 0; i <= num; i++){
           System.out.print(num1+" ");
           int num3 = num2 + num1;
           num1 = num2;
           num2 = num3;
       }
      // using java 8
        int n = 10;

        // Generate Fibonacci series using Streams
        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .forEach(System.out::println);
    }

}
