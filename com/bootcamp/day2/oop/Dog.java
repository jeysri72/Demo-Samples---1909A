package com.bootcamp.day2.oop;
// Dog - Sub class, Which is derived from the super class animal
public class Dog extends Animal{
    public Dog(boolean tail) {
        super(tail);
    }

    @Override
    public String sound(){
        return "Woof Woof";
    }
}
