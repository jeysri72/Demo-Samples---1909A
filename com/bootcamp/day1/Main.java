package com.bootcamp.day1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    // Command Line application has main method
    // This is the entry point for the command line java application

    public static void main(String[] args) {

        // Comments - 1. Single Line //
        //2. Multi Line - /* comments */

        /*
        This is my first java program
        I am writing Hello world
        and variables
        */


        // write your code here
        // Console output
        System.out.println("Hello Wolrd!");
        System.out.println("Java Programming");

        int myInt; // Variable Declaration
        // Has two parts - 1. Data Type, 2. Variable Name

        myInt = 5; //Variable Initialaization / Variable assignment
        // = - Is known as assignment operator
        // + - is known string concatenation symbol
        // String is identified by using string qulatifier "
        System.out.println("My valiable myInt value is = " + myInt);

        short myShort = 3; //Variable Declaration & Initialaization
        System.out.println("My valiable myShort value is = " + myShort);

        long myPrimitiveLong = 346456;

        // Two different Group - Primitive Data Type
        //                     = Object Data Type
        String myName = "Jey"; // String is an Object Data Type
        Long myLong = new Long(7);
        // ; - End of linr operator. You must uset it at the end of the line
        // Class is like a blue print, Memory space is not required
        // Object is like a building - realization of the bule print. Requires
        // memory sapce
        // Class Name (Scanner)
        // Object Name (input)
        // new - Keyword
        // Scanner(System.in)  - Constructor
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new integer value - ");
        myInt   = input.nextInt();
        System.out.println("My valiable myInt value is = " + myInt);
        System.out.println("Enter your Name - ");
        myName = input.next();
        System.out.println("My valiable myName value is = " + myName);
    }

}
