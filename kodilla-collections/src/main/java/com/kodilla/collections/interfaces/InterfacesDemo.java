package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square=new Square(10.00);
        /* przy tworzeniu obiektu typu Square mamy narzuconą zmienną width bo
        w konstruktorze ta zmianna została przekazana jako parametr
         */
        showShapeDetails(square);

        Circle circle=new Circle(7.00);
        /*
        możemy to zapisać Shape circle=new Circle lub nawet Shape shape=new Circle =>
        typem zmiennej jest interfejs czyli do takiej zmiennej możemy przypisać rerencję
        do obiektu dowolnej klasy, która implementuje ten interfejs
         */
        showShapeDetails(circle);

        Triangle triangle=new Triangle(6.0,4.0,7.211);
        showShapeDetails(triangle);//wywołanie na obiekcie shape, czyli trójkącie.

    }
    private static void showShapeDetails(Shape shape){
        /*
        metoda przyjmuje argument typu Shape a więc możemy przekazać obiekt dowolnej klasy
        która implementuje interfejs Shape
         */
        System.out.println(shape.getArea());
        /*ponieważ metoda getArea zwraca=return wywołujemy ją poprzez
        odwołanie do obiektu.
         */
        System.out.println(shape.getPerimeter());
    }
}
