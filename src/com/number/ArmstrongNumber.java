package com.number;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.Stream;

/* problem:- Armstrong number is a number that is equal to the sum of cubes of its digits
   input:- 153 output: Yes
   explanation: (1*1*1) + (5*5*5) + (3*3*3) = 1 + 125 + 27 = 153
*  */
public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter the number to check no is Armstrong or not :");
//        int inputNumber = sc.nextInt();
//        System.out.println("Entered Number: "+ inputNumber);
//        System.out.println(toCheckArmstrongNumber(inputNumber));
        System.out.println(toCheckArmstrongNumberUsingJava8(153));

    }
    public static String toCheckArmstrongNumber(int number){
        int temp = number;
        if(number == 0){
            return "No";
        }
        int sum = 0, res;
        while(number > 0){
            res = number % 10;
            number = number / 10;
            sum = sum + (res * res * res);
        }
       return temp == sum ? "Yes" : "No";

    }
    public static boolean toCheckArmstrongNumberUsingJava8(int number){
       String numbers = String.valueOf(number);
       int numberLength = numbers.length();
        int sum = numbers.chars().map(Character::getNumericValue)
                .map(ele -> (int) Math.pow(ele, numberLength))
                .sum();
        return sum == number;
    }
}
