package com.kodilla.inheritance.homework;

public class OldVersionPractice extends OperatingSystemPractice {
    public OldVersionPractice(int year) {
        super(year);
    }
    public void turnOn(){
        System.out.println("Turning on "+getYear());
    }
    public void turnOff(){
        System.out.println("Turning off "+getYear());
    }
}
