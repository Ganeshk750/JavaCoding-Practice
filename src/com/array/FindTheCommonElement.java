package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindTheCommonElement {
    public static void main(String[] args) {
      // approachIst();
       approach2nd();
    }
    public static void approachIst(){
        int array1 [] = {4,2,3,1,6};
        int array2 [] = {6,7,8,4};
        // output: {6,4}
        List<Integer> commonList = new ArrayList<>();
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    commonList.add(array1[i]);
                }
            }
        }
        System.out.println(commonList);
    }
    public static void approach2nd(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 2, 3, 1, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,4));
        list1.retainAll(list2);
        System.out.println("CommonElements: "+ list1);
    }

}
