package com.bootcamp.day1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        sum = a + b;
        System.out.println("Sum is: " + sum);
        int remainder;
        remainder = sum % 2;
        if (remainder == 0) {
            System.out.println("Sum is an even number");
        } else {
            System.out.println("Sum is an odd number");
        }
    }
}