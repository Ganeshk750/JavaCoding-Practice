package com.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Hello World");
        optionalString.ifPresent(value -> System.out.println("Optional String Value: "+value));

        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresent(value -> System.out.println("Value is :"+ value));

        Optional<Integer> optionalNumber = Optional.of(45);
        optionalNumber.ifPresent(value -> System.out.println("Processing Number: "+ value));

        Optional<String> optionalValue = Optional.of("Java Streams");
        optionalValue.ifPresentOrElse(value -> System.out.println("Value is : "+ value),
                ()-> System.out.println("No value found."));

        Optional<String> emptyString = Optional.empty();
        emptyString.ifPresentOrElse(value -> System.out.println("Value is : "+ value),
                () -> System.out.println("Value is not found."));

        Optional<String> configValue = Optional.ofNullable(System.getenv("CONFIG"));
        configValue.ifPresentOrElse(value -> System.out.println("Config loaded: " + value),
                () -> System.out.println("Default config will be used."));

        Optional<Object> userInput = Optional.ofNullable(null);
        userInput.ifPresentOrElse(value -> System.out.println("Processing input : "+ userInput),
                () -> System.out.println("No input provided. Using default."));

        String fetchFromDataBase="@";
        Optional<String> queryResult = Optional.ofNullable(fetchFromDataBase);
        queryResult.ifPresentOrElse(value -> System.out.println("Found Data: "+ value),
                () -> System.out.println("No data found. Redirecting to default view."));

    }
}
