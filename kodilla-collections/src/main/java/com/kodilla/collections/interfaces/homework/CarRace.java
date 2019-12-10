package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford=new Ford(80);
        doRace(ford);
        Opel opel=new Opel(90);
        doRace(opel);
        Suzuki suzuki=new Suzuki(100);
        doRace(suzuki);
    }
    private static void doRace(Car car){
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
