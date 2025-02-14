package com.string;

public class Permutation {
    public static void main(String[] args) {
     // permutations
        String str = "abc";
        String str1 ="";
        getPermutation(str, "");
    }
    public static void getPermutation(String str,String str1){
        if(str.length() == 0){
            System.out.println(str1);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            getPermutation(remaining, str1 + ch);
        }
    }
}
