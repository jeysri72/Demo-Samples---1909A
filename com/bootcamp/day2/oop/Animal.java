package com.bootcamp.day2.oop;

public class Animal {
    String color;
    String size;
    private boolean tail;
    int ear;
    private int legs;
    int eyes;
    double weight;
    // Constructor -
    // 1. Method is same as the class name
    // 2. Doesn't require return type

    public Animal(boolean tail){
        this.tail = tail; // this is a keyword to refer the current instance
    }

    public Animal(int legs){
        this.legs = legs; // this is a keyword to refer the current instance
    }

    public Animal(boolean tail,int legs){
        this.tail = tail;
        this.legs = legs; // this is a keyword to refer the current instance
    }

    public boolean getTail(){
        return this.tail;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }
    public int getLegs(){
        return this.legs;
    }
/*
    public void eat(String foodType){
    }*/

    public String sound(){
        return "Sound";
    }

    public String sound(String sound){
        return sound;
    }

    public void walk(){

    }
    public void run(){

    }
 }
