package com.bootcamp.day3.assignment2;

public abstract class Employee {
    static int counter = 1; // Shared among the instances
    private int employeeID;
    private String name;
    private double baseSalary;
    private  Employee manager;
    // getters & setters are called member functions
    // to expose the data members to others

    public Employee(String name, double baseSalary){
        this.employeeID = counter;
        this.name = name;
        this.baseSalary = baseSalary;
        counter ++;
    }

    public int getEmployeeID() {
        return employeeID;
    }
/*
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean equals(Employee other){
        if (this.employeeID == other.employeeID)
            return true;
        else
            return false;
    }

    public String toString(){// this method to represent the object in String format.
        return this.employeeID + " " + this.name;
    }

    abstract public String employeeStatus();
}
