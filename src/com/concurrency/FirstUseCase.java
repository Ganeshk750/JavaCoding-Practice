package com.concurrency;

/*
*  Create Two Threads using the executor framework and try to print oddNumber
*  with one thread and another thread will print even number one by one;
* */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstUseCase {
    private static volatile boolean isOddTurn = true;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable printOddNumber = () ->{
            for (int i =5; i<=20; i=i+2){
                synchronized (FirstUseCase.class){
                    while(!isOddTurn){
                        try {
                            FirstUseCase.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd number : "+i+ " -"+ Thread.currentThread().getName());
                    isOddTurn=false;
                    FirstUseCase.class.notify();
                }
            }
        };
        Runnable printEvenNumber = () ->{
            for (int i = 6; i<=20; i=i+2){
                synchronized (FirstUseCase.class){
                    while(isOddTurn){
                        try {
                            FirstUseCase.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even number : "+i+ " -"+ Thread.currentThread().getName());
                    isOddTurn=true;
                    FirstUseCase.class.notify();
                }
            }
        };
        executorService.submit(printOddNumber);
        executorService.submit(printEvenNumber);
        executorService.shutdown();
    }
}

class PrintEvenOddNumber {


}
