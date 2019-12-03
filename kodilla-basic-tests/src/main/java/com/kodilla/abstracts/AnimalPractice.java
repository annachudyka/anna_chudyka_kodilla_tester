package com.kodilla.abstracts;

public abstract class AnimalPractice {

    private int numberOfLegs;

    public AnimalPractice(int numberOfLegs){
        this.numberOfLegs=numberOfLegs;
    }
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public abstract void giveVoice();//metoda asbtrakcyjna. Szablon dla klas dziedziczących
}
