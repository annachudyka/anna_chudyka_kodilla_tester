package com.kodilla.inheritance.homework;

public class ApplicationOne {
    public static void main(String[] args){

        OperatingSystem operatingSystem=new OperatingSystem(2019);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println(operatingSystem.getYear());

        NewVersion newVersion=new NewVersion(2018);
        newVersion.turnOn();
        newVersion.turnOff();
        System.out.println(newVersion.getYear());

        OldVersion oldVersion=new OldVersion(2009);
        oldVersion.turnOn();
        oldVersion.turnOff();
        System.out.println(oldVersion.getYear());

    }
}
