package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(6, 10, 8);
    }

    @Override
    public int calculateSurfaceArea() {
        int surfaceTriangle=0;
        surfaceTriangle=getA()+getH()+getB();
        return surfaceTriangle;
    }

    @Override
    public int calculatePerimeter() {
        int perimeterTriangle=0;
        perimeterTriangle=(getA()*getH())/2;
        return perimeterTriangle;
    }
}
