package com.bootcamp.day2.oop;

public class Test {
    public static void main(String[] args){
        String name = "Jey";

        if (name == "Shree"){
            System.out.println("Same");
        }else   {
            System.out.println("Different");
        }

        if (name.equalsIgnoreCase("JEY")){
            System.out.println("Same");
        }else   {
            System.out.println("Different");
        }

        if (name.equals("JEY")){
            System.out.println("Same");
        }else   {
            System.out.println("Different");
        }

    }
}
