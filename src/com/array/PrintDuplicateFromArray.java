package com.array;

import java.util.HashSet;

public class PrintDuplicateFromArray {
    public static void main(String[] args) {
        String [] strArr = {"abc","def","abc","mno", "xyz","pqr","xyz","pqr"};
        firstApprach(strArr);
        secondApproach(strArr);
    }
    public static void firstApprach(String [] strArr){
        if(strArr.length == 0){
            return;
        }
        for(int i = 0; i < strArr.length; i++){
            for(int j = i+1; j < strArr.length; j++){
                if(strArr[i] == strArr[j]){
                    System.out.println("Duplicate String::"+ strArr[j]);
                }
            }
        }
    }
    public static void secondApproach(String[] strArr){
        if(strArr.length == 0){
            return;
        }
        HashSet<String> hashSet = new HashSet<>();
        for(String arrElement: strArr){
            if(!hashSet.add(arrElement)){
                System.out.println("Duplicate Elements::::"+ arrElement);
            }
        }
    }
}
