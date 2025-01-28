package com.number;

/*
*  Factorial Number 5! = 5*4*3*2*1 = 120
* */
public class Factorial {
    public static void main(String[] args) {
        firstApproach();
        secondApproach();
    }

    public static void firstApproach(){
        int inputNumber = 5;
        int temp = inputNumber;
        int result = 0;
        if(inputNumber == 0){
            return;
        }
        while(inputNumber > 0){
            inputNumber--;
            if(inputNumber != 0){
                temp = temp * inputNumber;
                result = temp;
            }

        }
        System.out.println(result);
    }
    public static void secondApproach(){
        int inputNumber = 5;
        int fact = 1;
        for(int i = 1; i <= inputNumber; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
