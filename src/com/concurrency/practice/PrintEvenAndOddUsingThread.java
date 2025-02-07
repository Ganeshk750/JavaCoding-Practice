package com.concurrency.practice;

public class PrintEvenAndOddUsingThread implements Runnable {
    Object object;
    static int  i = 1;

    public PrintEvenAndOddUsingThread(Object object){
        this.object = object;
    }
    @Override
    public void run() {
        while (i <= 10){
            if(i%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+ i);
                    i++;
                    try{
                        object.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            if(i%2 !=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+ i);
                    i++;
                   object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        Runnable tOne = new PrintEvenAndOddUsingThread(object);
        Runnable tTwo = new PrintEvenAndOddUsingThread(object);
        new Thread(tOne, "even").start();
        new Thread(tTwo, "odd").start();
    }
}
