package com.bootcamp.day3.assignment2;
// Technical employee - Sub Class
// Employee - Super class
public class TechnicalEmployee extends Employee{
    public int checkIns = 0;
    public TechnicalEmployee(String name){
        super(name,75000); // Calling the constructor menthod
                                    // in the super class with the default
                                    // base salary of 75000
    }

    // employeeStatus is a abstract method in the super class
    // It must be implemented in the sub class
    @Override
    public String employeeStatus() {
        //1 Kasey has 10 successful check ins
        //employeeID name has checkIns  successful check ins
        return this.toString() + " has " + this.checkIns + " successful check ins";
    }
}
