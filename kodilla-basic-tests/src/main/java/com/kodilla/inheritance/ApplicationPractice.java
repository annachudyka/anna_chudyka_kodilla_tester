package com.kodilla.inheritance;

public class ApplicationPractice {
    public static void main(String[] args) {
        CarPractice carPractice=new CarPractice(4,5);
        carPractice.turnOnLights();

        ConvertiblePractice convertiblePractice=new ConvertiblePractice(4,2);
        convertiblePractice.turnOnLights();
        //obiekt convertiblePractice daje dostęp do nieprywatnych metod z klasy ConvertiblePractice
        //oraz jednocześnie do nieprywatnych metod i zmiennych z klasy nadrzędnej (CarPractice)
        System.out.println(convertiblePractice.getSeats());//dostajemy się do wartości seats poprzez getSeats
        convertiblePractice.displayNumberOfSeats();
    }
}
