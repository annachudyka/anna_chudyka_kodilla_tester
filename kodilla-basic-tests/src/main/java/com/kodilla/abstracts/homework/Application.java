package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square=new Square();

        square.calculateSurfaceArea();
        int square1=square.calculateSurfaceArea();
        System.out.println("A surface area of the square is: "+square1);

        square.calculatePerimeter();
        int square2=square.calculatePerimeter();
        System.out.println("A perimeter of the square is: "+square2);

        Triangle triangle=new Triangle();

        triangle.calculateSurfaceArea();
        int triangle1=triangle.calculateSurfaceArea();
        System.out.println("A surface area of the triangle is: "+triangle1);

        triangle.calculatePerimeter();
        int triangle2=triangle.calculatePerimeter();
        System.out.println("A perimeter of the triangle is: "+triangle2);

        Rectangle rectangle=new Rectangle();

        rectangle.calculateSurfaceArea();
        int rectangle1=rectangle.calculateSurfaceArea();
        System.out.println("A surface area of the rectangle is: "+rectangle1);

        rectangle.calculatePerimeter();
        int rectangle2=rectangle.calculatePerimeter();
        System.out.println("A perimeter of the rectangle is: "+rectangle2);



    }
}
