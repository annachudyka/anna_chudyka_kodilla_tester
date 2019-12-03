package com.kodilla.inheritance.homework;

public class ApplicationOnePractice {
    public static void main(String[] args) {

        NewVersionPractice newVersionPractice=new NewVersionPractice(2019);
        newVersionPractice.turnOn();
        newVersionPractice.turnOff();

        OldVersionPractice oldVersionPractice=new OldVersionPractice(2000);
        oldVersionPractice.turnOn();
        oldVersionPractice.turnOff();
    }
}
