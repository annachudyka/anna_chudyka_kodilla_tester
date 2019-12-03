package com.kodilla.inheritance;

public class CarPractice {
    private int wheels; //modyfikator "prywatny" -> brak dostępu do zmiennej poprzez obiekt.zmienna
    private int seats;

    public void turnOnLights(){
        System.out.println("Lights were turned on");
    }//przykład metody która WYŚWIETLA (poprzez system.out.println

    public void openDoors(){
        System.out.println("Opening 4 doors");
    }
    public CarPractice(int wheels, int seats){//dodanie argumentów do konstruktora
        this.wheels=wheels;//przypisanie wartości
        this.seats=seats;
        System.out.println("CarPractice constructor");//konstruktor
    }

    public int getWheels(){// getter aby pobrać wartość prywatnej zmiennej
        return wheels;
    }
    public int getSeats(){
        return seats;
    }
    public void displayNumberOfSeats(){
        System.out.println("Number of seats: "+seats);
    }
}
