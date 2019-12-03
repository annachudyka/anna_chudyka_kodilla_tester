package com.kodilla.inheritance.homework;

public class NewVersionPractice extends OperatingSystemPractice {
    public NewVersionPractice(int year) {
        super(year);
    }
    public void turnOn(){
        System.out.println("Turning on "+getYear());
    }
    public void turnOff(){
        System.out.println("Turning off "+getYear());
    }
}
