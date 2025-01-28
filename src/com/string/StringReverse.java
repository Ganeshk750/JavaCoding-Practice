package com.string;

public class StringReverse {
    public static void main(String[] args) {
        String inputStr = "Ganesh";
        reverseString(inputStr);
        StringBuilder sb = new StringBuilder(inputStr);
        System.out.println("REVERSE STRING:: "+ sb.reverse());
    }
    public static void reverseString(String str){
       String rev = "";
       if(str.length() == 0){
           return;
       }
       for(int i = str.length() - 1; i >=0; i--){
           rev = rev.concat(String.valueOf(str.charAt(i)));
       }
        System.out.println("REVERSE STRING: "+ rev);
    }

}
