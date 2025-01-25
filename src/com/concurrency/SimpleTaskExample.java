package com.concurrency;

import java.util.concurrent.*;

public class SimpleTaskExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
         Future<?> future1 = executorService.submit(() -> {
             System.out.println("Runnable Task is executed by "+ Thread.currentThread().getName());
         });

        Future<String> future2 = executorService.submit(() ->{
            System.out.println("Callable Task is executed by "+ Thread.currentThread().getName());
            return "Result from callable task";
        });
        try {
          String result = future2.get();
            System.out.println(result);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        // Forcefully shutdown
       // executorService.shutdown();

        //Gracefully shutdown
        try{
          if(!executorService.awaitTermination(60, TimeUnit.SECONDS));
          executorService.shutdown();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
