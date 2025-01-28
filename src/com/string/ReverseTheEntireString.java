package com.string;

public class ReverseTheEntireString {
    public static void main(String[] args) {
       String str = "India is country My";
       // output:- My country is India
        firstApproach(str);
    }
    public static void firstApproach(String str){
        if(str.length() == 0){
            return;
        }
        String reverseResult = "";
        String inputArr [] = str.split(" ");
        for(int i = inputArr.length - 1; i >=0; i--){
            reverseResult = reverseResult + inputArr[i]+" ";
        }
        System.out.println(reverseResult);
    }
}
