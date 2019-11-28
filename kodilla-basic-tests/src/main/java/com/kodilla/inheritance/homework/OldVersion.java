package com.kodilla.inheritance.homework;

public class OldVersion extends OperatingSystem{

    public OldVersion(int year){
        super(year);
    }
    public void turnOff(){
        System.out.println("Turning off operating system 2009");
    }
    public void turnOn(){
        System.out.println("Turning on operating system 2009");
    }

}
