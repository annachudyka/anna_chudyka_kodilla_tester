package com.kodilla.school;

public class Grades {
    private int[]values;//zadeklarowana tablica z ocenami, z zerową liczba elementów
    private int size;//wartość opisująca wielkość tablicy

    public Grades(){//konstruktor
        this.values=new int[0];
        this.size=0;
    }

    public void add(int value){
        this.size=this.size+1;//zwiększamy o 1 wartość size, która opisuje wielkość tablicy
        int[]newTab=new int[this.size];//tworzymy nową tablicę. Jej rozmiar to this.size
        System.arraycopy(values,0,newTab,0, values.length);
        //metoda z klasy system. Pozwala skopiować tablicę źródłową do tablicy docelowej. zachowuje obecny
        //układ elementów
        newTab[this.size-1]=value;//1 odejmujemy od rozmiaru tablicy bo indeksy liczymy od zera.
        //przypisujemy newTab to elementu tablicy value
        this.values=newTab;//przypisanie nowej tablicy newTab to tablicy przechowywanej w klasie

    }
    public int[] getValues() {//getter aby dostać się do wartości ze zmiennej prywatnej
        return values;
    }
    public double getAverage(){
        if(this.values.length==0){
            return 0;
        }
        double sum=0;
        int i;
        for(i=0; i<this.values.length;i++){
            sum+=this.values[i];
        }
        return sum/this.values.length;
    }
}

