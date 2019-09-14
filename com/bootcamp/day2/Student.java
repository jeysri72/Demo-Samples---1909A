package com.bootcamp.day2;

public class Student {
    static int counter = 1;
    private int id;
    String name;

    public Student(){
        this.id = counter;
        counter++;
    }

    public Student(String name){
        this.name = name;
        this.id = counter;
        counter++;
    }

    public int getId(){
        return this.id;
    }
}
