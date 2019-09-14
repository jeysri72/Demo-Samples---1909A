package com.bootcamp.day3.assignment2;

import java.util.Scanner;

public class CompanyStructureInput {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input SE1's name - ");
        String name = input.next();
        SoftwareEngineer se1 = new SoftwareEngineer(name);

        System.out.println("Input SE2's name - ");
        name = input.next();
        SoftwareEngineer se2 = new SoftwareEngineer(name);

        System.out.println("Input TL's name - ");
        name = input.next();
        TechnicalLead te = new TechnicalLead(name);

        te.addReport(se1);
        te.addReport(se2);

        for (SoftwareEngineer se: te.team){
            System.out.println(se.employeeStatus());
        }

        // Print the software Engineer Name - 20 Chrs
        // Base Salary - 10 digits
        System.out.printf("%s \t %f\n" , se1.getName(), se1.getBaseSalary());
        System.out.printf("%20s \t %10.2f\n", se1.getName(), se1.getBaseSalary());
        System.out.printf("%-20s \t %-10.2f\n", se1.getName(), se1.getBaseSalary());
        System.out.printf("%-20s \t %10s\n", "Name" , "Salary");
        System.out.printf("%-20s \t %10s\n", "____________________" , "__________");
        System.out.printf("%-20s \t %10.2f\n", se1.getName(), se1.getBaseSalary());


    }
}
