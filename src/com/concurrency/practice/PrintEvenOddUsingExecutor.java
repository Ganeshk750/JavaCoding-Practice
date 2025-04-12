package com.concurrency.practice;

import com.concurrency.completablefuture.PrintEvenAndOddUsingCFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenOddUsingExecutor implements Runnable{
    private final Object lock;
    private static int number = 1;
    private final static int finalNumber = 10;
    public PrintEvenOddUsingExecutor(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        while(number <= finalNumber){
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+ ": "+ number);
                number++;
                lock.notify();
                if(number <= finalNumber){
                    try{
                        lock.wait();
                    }catch (InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new PrintEvenOddUsingExecutor(lock));
        executorService.execute(new PrintEvenOddUsingExecutor(lock));
        executorService.shutdown();
    }
}
