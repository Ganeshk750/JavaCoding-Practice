package com.solid;
/*
*  Open/closed Principle(OCP):- State that software entity should be open for
*  extension but closed for modification.
* */
class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape){
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }else if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        return 0;
    }
}

/* Based On Solid principles it becomes */
interface Shape {
    double calculateArea();
}
class Rect implements Shape {
    private double width;
    private double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class circles implements Shape {
    private double radius;

    public circles(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculators {
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
       Shape rectangle = new Rect(4,5);
       Shape circle = new circles(3);
       AreaCalculators calculators = new AreaCalculators();
       System.out.println("Rectangle Area: "+ calculators.calculateArea(rectangle));
       System.out.println("Circle Area: "+ calculators.calculateArea(circle));
    }
}