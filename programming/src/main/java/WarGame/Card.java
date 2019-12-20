package WarGame;

public class Card {

    private String name;
    private int number;

    public Card (int number, String name){
        this.number=number;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    /*
    utworzona tablica - konkretna liczba elementów
     */

    Card card1=new Card(1,"One");
    Card card2=new Card(2,"Two");
    Card card3=new Card(3, "Three");
    Card card4=new Card(4, "Four");
    Card card5=new Card(5,"Five");
    Card card6=new Card(6,"Six");
    Card card7=new Card(7,"Seven");
    Card card8=new Card(8,"Eight");
    Card card9=new Card(9,"Nine");
    Card card10=new Card(10,"Ten");

    Card[] cards=new Card[]{card1, card2,card3,card4,card5,card6,card7,card8,card9,card10};



}
