package com.kodilla.abstracts.homework;

public class OfficeAssistance extends Job {


    public OfficeAssistance() {
        super(2500, "administration management duties");
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());

    }
}
