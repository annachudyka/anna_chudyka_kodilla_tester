package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes=new LinkedList<>();
        /*
        za sprawą typu Shape kolekcja może przechowywać obiekty klas, które implementują interfejs Shape
         */
        //shapes.add(new Square(10.0));
        Square square=new Square(10.0);
        shapes.add(square);//zapamiętujemy obiekt aby go później usunąć metodą remove(object)
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.00, 10.77));

        for(Shape shape:shapes){
            System.out.println(shape + "; area: " + shape.getArea() + "; perimeter: " + shape.getPerimeter());
        }
        shapes.remove(1);//nasze koło, które do kolekcji zostało dodane jako drugie
        shapes.remove(square);
        //Triangle triangle=new Triangle(10.0, 4.0,10.77);
        //shapes.remove(triangle);
        shapes.remove(new Triangle(10.0,4.0,10.77));

        System.out.println(shapes.size());
        for(Shape shape:shapes){
            System.out.println(shape + "; area: " + shape.getArea() + "; perimeter: " + shape.getPerimeter());
        }
    }
}
