package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        // 1. newFixedThreadPool(int nThreads): Creates a thread pool with a fixed number of threads.
        // 2. newCachedThreadPool(): Creates a thread pool that creates new threads as needed,
        //    but will reuse previously constructed threads when they are available.
        // 3. newSingleThreadExecutor(): Creates an executor that uses a single worker thread.
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("Task 1 executed by "+ Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("Task 2 executed by "+ Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("Task 3 executed by "+ Thread.currentThread().getName()));
        //* shutdown(): Initiates an orderly shutdown in which previously submitted tasks are executed,
        // but no new tasks will be accepted.
        executorService.shutdown();
    }
}
