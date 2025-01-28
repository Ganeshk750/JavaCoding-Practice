package com.string;

public class PrintDuplicateCharacterFromString {
    public static void main(String[] args) {
        String inputStr = "apple is fruit";
        firstApproach(inputStr);
    }
    public static void firstApproach(String input){
        char [] charArr = input.toCharArray();
        System.out.println("The String is: "+input);
        System.out.println("Duplicate Characters in above string are: ");
        for(int i = 0 ; i < input.length(); i++){
            for(int j = i+1; j < input.length(); j++){
                if(charArr[i] == charArr[j]){
                    System.out.print(charArr[j]);
                    break;
                }
            }
        }
    }
}
