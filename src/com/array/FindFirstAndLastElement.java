package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstAndLastElement {
    public static void main(String[] args) {
        approachFist();
        approachSecond();
    }
    public static void approachSecond() {
        List<Integer> list = Arrays.asList(4, 2, 3, 1, 6);
        System.out.println("FirstElement: "+ list.get(0)
                + ": "+ "LastElements: "+ list.get(list.size() - 1));
    }
    public static void approachFist(){
        int array1 [] = {4,2,3,1,6};
        System.out.println("firstElement: "+ array1[0] + " "+ "lastElement: "+ array1[array1.length - 1]);
    }
}
