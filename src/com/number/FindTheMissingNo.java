package com.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindTheMissingNo {
    public static void main(String[] args) {
        Integer nums [] = {1,5,3,7,6};
        Arrays.sort(nums);
        int maxNo = nums[nums.length - 1];
        HashSet<Integer> numberSet = new HashSet<>(Arrays.asList(nums));
        List<Integer> missingNoList = new ArrayList<>();
        for(int i = 0; i <= maxNo + 1; i++){
            if(!numberSet.contains(i)){
                missingNoList.add(i);
                System.out.println(i);
            }
        }
        System.out.println(missingNoList);

     }

}
