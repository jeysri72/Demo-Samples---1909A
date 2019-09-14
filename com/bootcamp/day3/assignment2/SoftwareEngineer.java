package com.bootcamp.day3.assignment2;

public class SoftwareEngineer extends TechnicalEmployee{
    private  boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }


    public int getSuccessfulCheckIns(){
        return this.checkIns; // Inherited from TechnicalEmployee
    }

    public boolean checkInCode(){
        TechnicalLead te = (TechnicalLead) this.getManager();
        // Seek for manager approval
        // if the manager approves then increment the check ins count
        // else set false to code access
        if (te.approveCheckIn(this)){
            checkIns ++;
            return true;
        }else{
            this.codeAccess = false;
            return false;
        }
    }
}
