package com.kodilla.abstracts.homework;

public class Recruiter extends Job {


    public Recruiter() {
        super(3000, "Candidates acquisition");
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());

    }
}
