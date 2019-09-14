package com.bootcamp.day3.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyStructure {
    public static void main (String[] args){
       // Employee alice = new Employee("Alice", 5000);
        // Employee bob = new Employee("Bob", 6000);
        // Abstract class Employee cannot be instantiated;


        // Inheritance
        // TechnicalEmployee inherited all the members and methods of Employee
        TechnicalEmployee alice = new TechnicalEmployee("Alice");
        TechnicalEmployee bob = new TechnicalEmployee("Bob");

        System.out.println(alice.getBaseSalary());

        System.out.println(alice); // Call toString method
        System.out.println(bob); // Call toString method.

        System.out.println("Alice Equals to Bob?" + alice.equals(bob));

        System.out.println(alice.employeeStatus());
        System.out.println(bob.employeeStatus());

        //Employee charlie = new TechnicalEmployee("Charlie");
        //TechnicalEmployee david = new Employee("David");

        TechnicalLead martin = new TechnicalLead("Martin");
        System.out.println("Martin's Base Salary = " + martin.getBaseSalary());

        ArrayList<TechnicalEmployee> mylist = new ArrayList<>();
        mylist.add(alice);
        mylist.add(bob);
        /*
        for (int i=0; i<mylist.size(); i++){
            System.out.println(mylist[i]);
        }*/

        for (TechnicalEmployee te: mylist){
            System.out.println(te.employeeStatus());
            System.out.println(te.getName() + " " + te.getBaseSalary());
        }

       // martin.addReport(alice);

        SoftwareEngineer jey = new SoftwareEngineer("Jey");
        SoftwareEngineer peter = new SoftwareEngineer("Peter");
        SoftwareEngineer john = new SoftwareEngineer("John");
        SoftwareEngineer joseph = new SoftwareEngineer("Joseph");
        SoftwareEngineer kelvin = new SoftwareEngineer("Kelvin");

        martin.addReport(jey);
        martin.addReport(peter);
        martin.addReport(john);
        System.out.println(" Added Joseph? " + martin.addReport(joseph));
        System.out.println( " Added Kelvin? " + martin.addReport(kelvin));

        jey.setCodeAccess(true);
        jey.checkInCode();
        jey.checkInCode();
        joseph.setCodeAccess(true);
        joseph.checkInCode();
        for (SoftwareEngineer se: martin.team){
            System.out.println(se.employeeStatus());
          //  System.out.println(se.getName() + " " + se.getBaseSalary());
           // System.out.println(se.getName() + "'s Manager" + se.getManager());
        }
        System.out.println(martin.employeeStatus());



    }
}
