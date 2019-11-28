package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args){
        Car car=new Car(4,5);
        car.turnOnLights();

        Convertible convertible=new Convertible(4,2);
        convertible.turnOnLights();
        convertible.closeRoof();
        System.out.println(convertible.getSeats());

        convertible.displayNumberOfSeats();


    }
}