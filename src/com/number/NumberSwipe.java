package com.number;

public class NumberSwipe {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Before swipe "+ a + " = " + b);
         // 1. using third variable
//          int c = a + b;
//            a  =  c - a;
//            b  =  c - b;
//        System.out.println("After swipe "+ a + "==" + b);
        // 2. without third variable
//         a = a + b;
//         b = a - b;
//         a = a - b;
//        System.out.println("==After swipe "+ a + "==" + b);

        // 3. using XOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("==After swipe=="+ a + "==" + b);



    }
}
