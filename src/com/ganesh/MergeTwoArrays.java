package com.ganesh;

// Problem:- WAP to Merge Two String Arrays.
// Example:- array1 = {"Java", "is", "fun"}; array2 = {"and", "powerful"};
// output:- "Java is fun and powerful"

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] array1 = {"Java", "is", "fun"};
        String[] array2 = {"and", "powerful"};

        // 1. Approach
        mergingArrayUsingLoop(array1, array2);
    }

    private static void mergingArrayUsingLoop(String[] array1, String[] array2){
        // Merging the arrays
        String[] mergedArray = new String[array1.length + array2.length];
        int index = 0;

        for (String element : array1) {
            mergedArray[index++] = element;
        }
        for (String element : array2) {
            mergedArray[index++] = element;
        }

        // Printing the merged array
        System.out.println("Merged String Array using Loop: ");
        for (String element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
