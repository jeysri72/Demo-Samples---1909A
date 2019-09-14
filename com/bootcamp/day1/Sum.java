package com.bootcamp.day1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a;
        int b;

        a = getNumber();
        b = getNumber();

        System.out.println(add(a,b));
    }



    public static int getNumber() {
       // int result =-1;
        Scanner input = new Scanner(System.in);
        int  result = input.nextInt();
        return result;
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}
