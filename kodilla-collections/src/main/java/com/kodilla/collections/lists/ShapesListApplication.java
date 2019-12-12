package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square>shapes=new ArrayList<>();
        /*
        utworzenie zmiennej shapes o typie List<Square> oraz przypisanie tego do pustej kolekcji w
        postaci obiektu klasy ArrayList
         */
        /*
        Square sq1=new Square(10.0);
        Square sq2=new Square(5.0);
        Square sq3=new Square(1.0);
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);
        Może być jak powyżej ale tworzymy nadmiarowe zmienne. Może być-poniżej
         */
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        //for(int n=0;n<shapes.size();n++){//pętla for, która wyświetli wszystkie obiekty w kolekcji
            /*
            Wartość n w pętli jest zwiększana o 1 zaczynając od 0 aż do 2. Rozmiar kolekcji =3 a warunek
            to n<rozmiar kolekcji
            Square square=shapes.get(n);dla każdego n z kolekcji pobierany jest obiekt. referencja do niego umieszczana jest w zmiennej square
                if(square.getArea()>20) tylko obiekty których pole jest większe niż 20
                    System.out.println(square+", area: "+square.getArea());
             */
        for(Square square:shapes){//pętla for each
            if(square.getArea()>20)
                System.out.println(square+", area: "+square.getArea());
        }

    }
}
