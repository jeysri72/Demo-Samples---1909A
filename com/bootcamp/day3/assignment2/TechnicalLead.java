package com.bootcamp.day3.assignment2;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    private int headCount;
    public ArrayList<SoftwareEngineer> team = new ArrayList<>();
    public TechnicalLead(String name) {
        super(name);
        // Base salary is 1.3 times of TechnicalEmployee
        //double newSalary = this.getBaseSalary() * 1.3;
        //this.setBaseSalary(newSalary);

        this.setBaseSalary(this.getBaseSalary()*1.3);

        this.headCount = 4;
    }

    public boolean hasHeadCount(){
        if (this.team.size() < this.headCount)
            return true;
        else
            return false;
    }
    public boolean addReport(SoftwareEngineer e){
        if (this.hasHeadCount()){
            // Add to team
            team.add(e);
            e.setManager(this);
            return true;
        }else{
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){

        // If the software engineer has code access and reporting to this technical lead
        // How to check his reporting
        // 1. Software Engineer's manager equals to the current instance
        // ((te.equals(this) ) && e.getCodeAccess())
        // 2. Software Engineer in his team
        // (this.team.contains(e) && e.getCodeAccess())
        TechnicalLead te = (TechnicalLead)e.getManager(); //Type Casting
       // if (this.team.contains(e) && e.getCodeAccess())

        if ((te.equals(this) ) && e.getCodeAccess()){
            checkIns++;
            return true;
        }else{
            return false;
        }
    }
}
