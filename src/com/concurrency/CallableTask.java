package com.concurrency;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    private final String name;

    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        System.out.println("Task " + name + " is being executed by "+ Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Result of " + name;
    }
}
