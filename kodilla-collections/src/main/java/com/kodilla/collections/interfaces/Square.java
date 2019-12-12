package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Square implements Shape{
    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    /*
            Klasa Square jest zgodna z interfejsem Shape = klasa implementuje interfejs
            o czym świadczy "implements"
             */
    private double width;//zmienna bok kwadratu

    public Square(double width){//konstruktor inicjujący zmienną boku, przekazany paramter int bok
        this.width=width;
    }
    public double getArea(){//metoda obliczająca pole powierzchni
        return width*width;
    }
    public double getPerimeter(){//metoda obliczająca obwód
        return 4*width;
    }/*
    metoda getPerimter to szablon metody zaczerpnięty z interfejsu. Można tak zrobić bo
    metoda jest PUBLICZNA
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }
}
