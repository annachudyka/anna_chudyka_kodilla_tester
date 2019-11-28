package com.kodilla.inheritance.homework;

public class NewVersion extends OperatingSystem {

    public NewVersion(int year){
        super(year);
    }
    public void turnOn() {
        System.out.println("Turning on operating system 2018");
    }
    public void turnOff() {
        System.out.println("Turning off operating system 2018");
    }


}
