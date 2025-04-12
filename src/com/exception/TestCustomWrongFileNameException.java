package com.exception;

public class TestCustomWrongFileNameException {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Exception Occurred: "+ ex);
        }
    }
    static void validate (int age) throws InvalidAgeException {
       if(age < 18){
           throw new InvalidAgeException("Age is not valid for vote.");
       }else {
           System.out.println("Welcome to vote");
       }
    }
}
