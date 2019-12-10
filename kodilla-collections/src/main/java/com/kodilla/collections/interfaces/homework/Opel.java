package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed){
        this.speed=speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed+=10;
        System.out.println(this.speed);
    }
    @Override
    public void decreaseSpeed() {
        speed-=5;
        System.out.println(this.speed);
    }
}
