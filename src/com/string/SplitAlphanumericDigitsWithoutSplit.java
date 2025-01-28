package com.string;

public class SplitAlphanumericDigitsWithoutSplit {
    public static void main(String[] args) {
        String inputArr = "Welcome234To567Java89Programming0!@#$%^&*";
        firstApproach(inputArr);
    }
    public static void firstApproach(String inputArr){
        if(inputArr.length() == 0){
            return;
        }
        StringBuffer number = new StringBuffer();
        StringBuffer special = new StringBuffer();
        StringBuffer string = new StringBuffer();
        for(int i = 0; i < inputArr.length(); i++){
            if(Character.isDigit(inputArr.charAt(i))){
                number.append(inputArr.charAt(i));
            } else if(Character.isAlphabetic(inputArr.charAt(i))){
                string.append(inputArr.charAt(i));
            }else{
                special.append(inputArr.charAt(i));
            }
        }
        System.out.println("Alphabetic String: "+ string);
        System.out.println("Numeric String: "+ number);
        System.out.println("Special Character String: "+ special);
    }
}
