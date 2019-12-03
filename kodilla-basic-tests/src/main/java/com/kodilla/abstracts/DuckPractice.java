package com.kodilla.abstracts;

public class DuckPractice extends AnimalPractice {
    public DuckPractice() {// nie musimy wpisywać parametru int number of legs do konstruktora
        super(2);//ale przy super już musimy podać dokładną wartość parametru numberOfLegs
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack Quack");
    }
}
