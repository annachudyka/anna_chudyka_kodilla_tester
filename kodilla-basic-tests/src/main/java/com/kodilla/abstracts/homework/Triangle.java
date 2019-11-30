package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(6, 10, 8);
    }

    @Override
    public int calculateSurfaceArea() {
        int surfaceTriangle=0;
        int A=6;
        int H=8;
        int B=10;
        surfaceTriangle=A+H+B;
        return surfaceTriangle;
    }

    @Override
    public int calculatePerimeter() {
        int perimeterTriangle=0;
        int A=6;
        int H=8;
        perimeterTriangle=(A*H)/2;
        return perimeterTriangle;
    }
}
