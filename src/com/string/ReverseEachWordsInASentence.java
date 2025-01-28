package com.string;

public class ReverseEachWordsInASentence {
    public static void main(String[] args) {
        String inputStr = "reverse each word in a string";
        firstApproach(inputStr);
        secondApproach(inputStr);
    }

    public static void secondApproach(String inputStr){
        if(inputStr.length() == 0){
            return;
        }
        String strArr [] = inputStr.split(" ");
        String revStr = "";
        for(String str: strArr){
            StringBuilder sb = new StringBuilder(str);
            revStr = revStr + sb.reverse() + " ";
        }
        System.out.println("Using String Buildr:: "+ revStr);
    }
    public static void firstApproach(String inputStr){
        if(inputStr.length() == 0){
            return;
        }
        String[] strArr = inputStr.split(" ");
        String eachWordRevStr = "";
        String rev= "";
        for(String str: strArr){
            if(str.length() >= 1){
               rev = reverseString(str);
            }
            eachWordRevStr = eachWordRevStr + rev + " ";
        }
        System.out.println("Result: "+ eachWordRevStr);

    }
    public static String reverseString(String str){
        if(str.length() == 0){
            return "";
        }
        if(str.length() == 1){
            return str;
        }
        String rev ="";
        if(str.length() > 1){
            for(int i = str.length() - 1; i >=0; i--){
               rev = rev.concat(String.valueOf(str.charAt(i)));
            }
        }
        return rev;
    }

}
