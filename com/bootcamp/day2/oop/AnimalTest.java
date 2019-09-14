package com.bootcamp.day2.oop;

import com.bootcamp.day2.oop.Animal;
import com.bootcamp.day2.oop.Cat;
import com.bootcamp.day2.oop.Dog;

public class AnimalTest {


    public static void main (String[] args){

        Animal dog = new Animal(true);
        Animal gorilla = new Animal(false);

       // System.out.println("Dog has tail?\n" + dog.tail);
      //  System.out.println("Gorilla has tail?\n" + gorilla.tail);

        System.out.println("Dog has tail?\n" + dog.getTail());
        System.out.println("Gorilla has tail?\n" + gorilla.getTail());


        dog.setLegs(4);
        System.out.printf("Dog has %d legs\n", dog.getLegs());

        dog.ear = 2;
        System.out.printf("Dog has %d ears\n", dog.ear);

        Dog labrador = new Dog(true);
        System.out.println("Labrador has tail?\n" + labrador.getTail());

        System.out.println(dog.sound());
        System.out.println(labrador.sound());


        Cat blacky = new Cat();
        System.out.println("Blacky has tail?\n" + blacky.getTail());

        System.out.println(blacky.sound());
    }

}