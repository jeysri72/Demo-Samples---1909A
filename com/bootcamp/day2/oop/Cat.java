package com.bootcamp.day2.oop;

public class Cat extends Animal implements IAnimal {
    public Cat() {
        super(true);
    }

    @Override
    public String sound(){
        return super.sound() + "Meow Meow";
    }


    @Override
    public void eat() {
        System.out.println("Eats Fish");
    }
}
