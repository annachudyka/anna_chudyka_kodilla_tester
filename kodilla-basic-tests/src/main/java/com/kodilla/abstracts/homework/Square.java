package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square() {
        super(6);
    }

    @Override
    public int calculateSurfaceArea() {
       int surfaceSquare;
       surfaceSquare=4*getA();
       return surfaceSquare;
    }

    @Override
    public int calculatePerimeter() {
        int perimeterSquare;
        perimeterSquare=getA()*getA();
        return perimeterSquare;

    }
}
