package com.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(new ScheduledTask("Task 1"), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new ScheduledTask("Task 2"), 10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class ScheduledTask implements Runnable {

    private final String name;

    public ScheduledTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task "+ name + " is executed by "+ Thread.currentThread().getName());
    }

    /*
    * The ExecutorService interface in Java provides a powerful framework for managing and executing asynchronous tasks.
    * By using ExecutorService, you can simplify the handling of multithreading, improve resource management,
    * and enhance the performance of your applications. This tutorial covered the basics of creating an ExecutorService,
    * submitting tasks, handling Callable and Future, and using ScheduledExecutorService.
    * */
}
