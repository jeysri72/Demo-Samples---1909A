package com.bootcamp.day1;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        int num1;
        int num2;

        num1 = getNumber("Enter the value of num1");
        num2 = getNumber("Enter the value of num2");

        System.out.println("Sum of num1 & num2 =" + add(num1,num2));
        System.out.printf("Sum of %d & %d = %d" , num1, num2, add(num1,num2));
    }



    public static int getNumber(String prompt) {
       // int result =-1;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int  result = input.nextInt();
        return result;
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}
