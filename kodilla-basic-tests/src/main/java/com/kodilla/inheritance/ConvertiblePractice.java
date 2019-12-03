package com.kodilla.inheritance;

public class ConvertiblePractice extends CarPractice {
    //dodajemy metody void (wyświetlające)

    public void openRoof(){
        System.out.println("Opening roof...");
    }
    public void closeRoof(){
        System.out.println("Closing roof...");
    }
    public void openDoors(){
        System.out.println("Opening 2 doors");
    }
    public ConvertiblePractice(int wheels, int seats){   //konstruktor
        super(wheels, seats);//super to polecenie wywołania konstruktora z nadklasy. Konstruktor przyjmuje parametry int wheels, int seats
        //do super należy przekazać wartości, które odpowiadają konstruktorowi w nadklasie.
        System.out.println("ConvertiblePractice constructor");
    }//tworząc obiekty klasy ConvertiblePractice wywołujemy konstruktor z klasy nadrzędnej Car oraz przypisujemy im wartości


}
