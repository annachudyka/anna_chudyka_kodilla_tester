package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle() {
        super(6, 10);
    }

    @Override
    public int calculateSurfaceArea() {
        int surfaceRectangle;
        surfaceRectangle=2*getA()+2*getB();
        return surfaceRectangle;

    }
    @Override
    public int calculatePerimeter() {
        int perimeterRectangle;
        perimeterRectangle=getA()*getB();
        return perimeterRectangle;
    }
}
