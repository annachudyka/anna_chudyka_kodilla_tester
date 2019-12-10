package com.kodilla.collections.interfaces;

public class Square implements Shape{
    private double width;//zmienna bok kwadratu

    public Square(double width){//konstruktor inicjujący zmienną boku
        this.width=width;
    }
    public double getArea(){//metoda obliczająca pole powierzchni
        return width*width;
    }
    public double getPerimeter(){
        return 4*width;
    }
}
