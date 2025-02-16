package com.enhancement;

import java.util.HashMap;
import java.util.function.Predicate;

public class VarKeyWordDemo {
    public static void main(String[] args) {
        var i = 10;
        var str = "Ganesh";
        System.out.println("Values: "+ i + ": "+ str);
        var map = new HashMap<>();
        map.put(1,"Test");
        map.put(2,"Test");
        map.put(3,"Test");
        map.put(4,true);
        System.out.println(map);
        Employee emp = new Employee();
        var empObj = new Employee();

        Predicate<Integer> isEven = (var number) -> number % 2 == 0;
        System.out.println(isEven.test(10));
    }
}

class Employee {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
