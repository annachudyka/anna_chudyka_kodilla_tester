package com.kodilla.abstracts;

public class DogPractice extends AnimalPractice {

    public DogPractice() {
        super(4);//musimy wywołać konstruktor z nadklasy
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }
}
