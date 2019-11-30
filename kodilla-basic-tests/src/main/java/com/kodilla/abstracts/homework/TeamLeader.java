package com.kodilla.abstracts.homework;

public class TeamLeader extends Job {


    public TeamLeader() {
        super(3500, "Team management");
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
