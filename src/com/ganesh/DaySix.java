package com.ganesh;

import java.util.Stack;

// Problem:- WAP to validate Valid Parentheses;
// Example String inputA = "({[]})" is valid and String inputB = "([)]" invalid
public class DaySix {
    public static void main(String[] args) {
        String inputA = "({[]})";
        String inputB = "([)]";
        System.out.println("Input: " + inputA + " - Valid: " + isValidate(inputA));
        System.out.println("Input: " + inputA + " - Valid: " + isValidate(inputB));
    }

    public static boolean isValidate(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push corresponding opening bracket onto stack if closing bracket is found
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening bracket onto stack
            } else {
                return false; // Invalid case
            }
        }

        return stack.isEmpty(); // Return true if stack is empty, false otherwise
    }
}
