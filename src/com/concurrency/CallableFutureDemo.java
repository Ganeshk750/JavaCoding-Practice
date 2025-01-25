package com.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new CallableTask("Task 1"));
        Future<String> future2 = executorService.submit(new CallableTask(" Task 2"));

        try{
            System.out.println(future1.get());
            System.out.println(future2.get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
