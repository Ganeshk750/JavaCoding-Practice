package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        firstApproach();
    }
    public static void firstApproach(){
        List<Integer> list = Arrays.asList(4,3,2,1,0,6,12,15,20);
        Collections.sort(list);
        System.out.println("Second Largest Elements: "+ list.get(list.size() - 2));
        System.out.println("Second Smallest Elements: "+ list.get(1));
     }
}
