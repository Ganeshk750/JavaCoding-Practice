package com.solid;
/*
  Principle states that objects of a superclass should be replaceable with
  Objects of superclass without affecting the correctness of the program.

  OR

* */
class Bird {
    public void fly(){
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird {
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
class Penguin extends Bird {
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
/* Based On Solid principles it becomes */
abstract class Birds {
    public abstract void move();
}
class Sparrows extends Birds {
    @Override
    public void move(){
        System.out.println("Sparrow is flying");
    }
}
class Penguins extends Birds {
    @Override
    public void move(){
        System.out.println("Penguin is swimming");
    }
}
public class LiskovSubstitution {
    public static void main(String[] args) {
        Birds sparrow = new Sparrows();
        Birds penguin = new Penguins();
        sparrow.move();
        penguin.move();
    }
}
