package com.bootcamp.day2;

// Compliation Error - While build - Syntax errors
// Logical Error - Not getting the expected result - Debugging
// - Must set the break points.
// - Click against the line number - Red circle will appear
// - Executing step by step and analayze the values
// Runtime Error - Sometimes your program works fine. It has some issues
// based the user input or the processed value
// How to handle the run time errors
// We use try catch block
// try something catch the exception when its going wrong

public class Division {
    public static void main(String[] args){
        int dividend = 5;
        int divisor = 0;
        try {
        int result = dividend / divisor;

        System.out.println(result);
    }catch (ArithmeticException e){
        System.out.println(e.getCause());
        System.out.println(e.getMessage());
    }
    }
}
