package com.dp;
// Creational design pattern
 class Singletan {
    private static Singletan instance;
    private Singletan() {}
    public static synchronized Singletan getInstance(){
        if(instance == null){
            instance = new Singletan();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello, I am Singleton");
    }
}

public class Test {
    public static void main(String[] args) {
        Singletan obj1 = Singletan.getInstance();
        Singletan obj2 = Singletan.getInstance();
        int value1 = obj1.hashCode();
        int value2 = obj2.hashCode();
        System.out.println("HashCode Value of Different Obje ::"+ value1 + ":::"+ value2);
        System.out.println(obj1 == obj2);
        obj1.showMessage();
    }
}
