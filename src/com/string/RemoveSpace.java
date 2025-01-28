package com.string;

import java.util.Arrays;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Hello Java Learning";
        String replacedString = str.replaceAll("\\s","");
        System.out.println(replacedString);
    }
}
