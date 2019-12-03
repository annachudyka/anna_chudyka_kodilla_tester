package com.kodilla.inheritance.homework;

public class OperatingSystemPractice {
    private int year;

    public OperatingSystemPractice(int year){
        this.year=year;
    }

    public void turnOn(){
        System.out.println("Turning on "+year);
    }
    public void turnOff(){
        System.out.println("Turning off "+year);
    }
    public int getYear(){
        return year;
    }
}
