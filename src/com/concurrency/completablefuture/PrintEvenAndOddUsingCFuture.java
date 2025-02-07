package com.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintEvenAndOddUsingCFuture {
    private static Object object = new Object();
    private static IntPredicate evenPredicate = n -> n % 2 == 0;
    private static IntPredicate oddPredicate = n -> n % 2 != 0;

    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> PrintEvenAndOddUsingCFuture.printNumber(oddPredicate));
        CompletableFuture.runAsync(() -> PrintEvenAndOddUsingCFuture.printNumber(evenPredicate));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void printNumber(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition).forEach(PrintEvenAndOddUsingCFuture::execute);
    }
    public static void execute(int num){
        synchronized (object){
            try {
                System.out.println(Thread.currentThread().getName()+ " : "+ num);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
