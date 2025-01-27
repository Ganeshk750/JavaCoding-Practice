package com.solid;

/*
* The Interface Segregation Principle states that no client should be
* forced to depend on methods it does not use. Instead of one large interface,
*  many smaller and most specific interfaces are preferred.
* */

interface Worker {
    void work();
    void eat();
}

class Developer implements  Worker{
    @Override
    public void work(){
        System.out.println("Developer is coding.");
    }
    @Override
    public void eat(){
        System.out.println("Developer is eating.");
    }
}

class Robot implements Worker {
    @Override
    public void work(){
        System.out.println("Robot is working.");
    }
    @Override
    public void eat(){
        throw new UnsupportedOperationException("Robot does not eat.");
    }
}
/* Based On Solid principles it becomes */
interface Workable {
    void work();
}
interface Eatable{
    void eat();
}
class Developers implements Workable, Eatable {
    @Override
    public void work(){
        System.out.println("Developer is coding.");
    }
    @Override
    public void eat(){
        System.out.println("Developer is eating.");
    }
}
class Robots implements Workable {
    @Override
    public void work(){
        System.out.println("Robot is working.");
    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {
        Workable developer = new Developers();
        developer.work();
        Eatable eatableDeveloper = (Eatable) developer;
        eatableDeveloper.eat();
        Workable robot = new Robots();
        robot.work();
    }
}
