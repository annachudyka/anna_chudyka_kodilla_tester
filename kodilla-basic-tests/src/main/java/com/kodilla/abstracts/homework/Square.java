package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square() {
        super(5, 10, 8);
    }

    @Override
    public int calculateSurfaceArea() {
       int surfaceSquare=0;
       int A=5;
       surfaceSquare=4*A;
       return surfaceSquare;
    }

    @Override
    public int calculatePerimeter() {
        int perimeterSquare=0;
        int A=5;
        perimeterSquare=A*A;
        return perimeterSquare;

    }
}
