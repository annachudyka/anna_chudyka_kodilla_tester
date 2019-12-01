package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle() {
        super(6, 10);
    }

    @Override
    public int calculateSurfaceArea() {
        int surfaceRectangle=0;
        surfaceRectangle=2*getA()+2*getB();
        return surfaceRectangle;

    }
    @Override
    public int calculatePerimeter() {
        int perimeterRectangle=0;
        perimeterRectangle=getA()*getB();
        return perimeterRectangle;
    }
}
