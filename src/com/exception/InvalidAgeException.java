package com.exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}
