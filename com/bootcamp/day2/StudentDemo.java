package com.bootcamp.day2;

public class StudentDemo {
    public static void main (String[] args){
        Student bob = new Student();
        Student david = new Student();
        Student alice = new Student("Alice");

        bob.name = "Bob";
        System.out.println("Bob's Id - " + bob.getId());
        david.name = "David";
        System.out.println("David's Id - " + david.getId());

        System.out.println("Alice's Id - " + alice.getId());

    }
}
