package com.concurrency.practice;
// Parallel Sum Calculation
// The goal of this exercise is to divide a large array into smaller chunks
// and calculate the sum of each chunk in parallel.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
* Steps:
1. Split the array into several chunks.
2. Use ExecutorService to process each chunk in parallel.
3. Combine the results of the individual sums to get the final total sum.
* */
public class ParallelSumCalculation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      int [] arr = new int [1000000];
      for(int i = 0; i < arr.length; i++){
          arr[i] = 1;
      }
        ExecutorService executor = Executors.newFixedThreadPool(4);
        int chunkSize = arr.length / 4;
        List<Future<Integer>> results = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            if( i == 3) end = arr.length;
            results.add(executor.submit(new SumTask(arr, start, end)));
        }
        int totalSum = 0;
        for(Future<Integer> result : results){
            totalSum +=result.get();
        }
        System.out.println("Total Sum: "+ totalSum);
        executor.shutdown();
    }
}

class SumTask implements Callable {
    private int[] arr;
    private int start;
    private int end;

    SumTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Object call() throws Exception {
        int sum = 0;

        for(int i = start; i < end; i++){
            sum +=arr[i];
        }
        return sum;
    }
}
