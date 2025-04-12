package com.exception;

public class WrongFileNameException extends Exception {

    public WrongFileNameException(String errorMessage){
        super(errorMessage);
    }
}
