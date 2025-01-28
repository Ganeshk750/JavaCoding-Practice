package com.array;

import java.util.Arrays;
import java.util.Collections;

public class ShortArrayWithoutUsingHelper {
    public static void main(String[] args) {
        firstApproach();
        // using Arrays.sort()
        int [] nums = {10,5,20,63,12,57,88,60};
        Arrays.sort(nums);
        System.out.println("Using Arrays Sort => "+ Arrays.toString(nums));

    }
    public static void firstApproach(){
        int [] nums = {10,5,20,63,12,57,88,60};
        System.out.println("Before Sorting: "+Arrays.toString(nums));
        int max;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    max = nums[i];
                    nums[i] = nums[j];
                    nums[j] = max;
                }
            }
        }
        System.out.println("After Accending Sorting "+ Arrays.toString(nums));
        System.out.println("Before Decending sorting: "+ Arrays.toString(nums));
        int min;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    min = nums[j];
                    nums[j] = nums[i];
                    nums[i] = min;
                }
            }
        }
        System.out.println("After Decending sorting: "+ Arrays.toString(nums));

    }
}
