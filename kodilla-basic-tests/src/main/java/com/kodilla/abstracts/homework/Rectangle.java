package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle() {
        super(6, 10, 8);
    }

    @Override
    public int calculateSurfaceArea() {
        int surfaceRectangle=0;
        int A=6;
        int B=10;
        surfaceRectangle=2*A+2*B;
        return surfaceRectangle;

    }

    @Override
    public int calculatePerimeter() {
        int perimeterRectangle=0;
        int A=6;
        int B=10;
        perimeterRectangle=A*B;
        return perimeterRectangle;
    }
}
