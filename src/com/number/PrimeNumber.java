package com.number;
/*
*  Prime number is a number that is greater than 1 and divided by 1 or its self only.
*  input:31 output:- the number is prime
* */
public class PrimeNumber {
    public static void main(String[] args) {
        firstApprach();
    }
    public static void firstApprach(){
        int number = 31;
        if(number == 0){
            return;
        }
        if(number % 2 == 1 && number / number == 1){
            System.out.println("the number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
