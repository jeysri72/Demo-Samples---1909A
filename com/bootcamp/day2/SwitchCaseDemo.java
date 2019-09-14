package com.bootcamp.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jeyashree
 * @since 8 Sep 19
 * @version 1.0
 *
 * Display the numbers in word using switch case
 * Ex: 1 - One
 *
 */
public class SwitchCaseDemo {
    public static void main(String[] args){
try {
    //Get user input
    System.out.println("Enter your number ");
    Scanner input = new Scanner(System.in);
    //int myValue = Integer.parseInt(input.next());
    int myValue = input.nextInt();
    switch (myValue) {
        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        default:
            System.out.println("Not considered");
            break;
    }
}catch (InputMismatchException e){
    e.getMessage();
    e.getCause();
    e.printStackTrace();

}catch (Exception e){
    e.getMessage();
    e.getCause();
    System.out.println("PLease enter numeric value only");
    e.printStackTrace();
}
    }

}
