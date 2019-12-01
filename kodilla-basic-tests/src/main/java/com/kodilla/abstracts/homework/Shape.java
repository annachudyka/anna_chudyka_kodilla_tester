package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int A;
    private int B;
    private int H;

    public Shape(int A, int B, int H){
        this.A=A;
        this.B=B;
        this.H=H;
    }
    public Shape(int A, int B){
        this.A=A;
        this.B=B;
    }
    public Shape(int A){
        this.A=A;
    }

    public int getA(){
        return A;
    }
    public int getB(){
        return B;
    }
    public int getH(){
        return H;
    }

    public abstract int calculateSurfaceArea();

    public abstract int calculatePerimeter();

}
