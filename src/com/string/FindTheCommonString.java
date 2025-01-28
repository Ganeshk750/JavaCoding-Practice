package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheCommonString {
    public static void main(String[] args) {
        firstApproach();
        secondApproach();
        thirdApproach();
    }
    public static void thirdApproach(){
        String arr1 [] = {"Java", "JavaScript", "C","C++"};
        String arr2 [] = {"Python", "C#","Java","C++"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        List<String> commonString = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("Common String: "+ commonString);
    }
    public static void secondApproach(){
        String arr1 [] = {"Java", "JavaScript", "C","C++"};
        String arr2 [] = {"Python", "C#","Java","C++"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.retainAll(list2);
        System.out.println("Common String using retainAll:: "+ list1);
    }
    public static void firstApproach(){
        String arr1 [] = {"Java", "JavaScript", "C","C++"};
        String arr2 [] = {"Python", "C#","Java","C++"};
        ArrayList<String> outputArray = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    outputArray.add(arr1[i]);
                }
            }
        }
        System.out.println("Common String: "+ outputArray);
    }
}
