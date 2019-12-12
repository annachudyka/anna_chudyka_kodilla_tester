package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    private int speed;

    public Ford(int speed){
        this.speed=speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed+=20;
        System.out.println(this.speed);//metoda nic nie zwraca dlatego wyświetlamy poprzez odwołanie się
        //do zmiennej klasy - speed
    }
    @Override
    public void decreaseSpeed() {
        speed-=10;
        System.out.println(this.speed);
    }
}
