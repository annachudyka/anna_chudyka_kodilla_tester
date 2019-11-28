package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year){
        this.year=year;
    }
    public void turnOn(){
        System.out.println("Turning on operating system 2019");
    }
    public void turnOff(){
        System.out.println("Turning off operating system 2019");
    }
    public int getYear(){
        return year;
    }
}
