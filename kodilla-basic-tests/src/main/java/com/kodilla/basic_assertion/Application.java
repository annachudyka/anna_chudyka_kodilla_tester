package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args){

        Calculator calculator=new Calculator();
        int a=5;
        int b=8;
        int sumResult=calculator.sum(a,b);

        boolean correct=ResultChecker.assertEquals(13,sumResult);
        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb "+a+" i "+b);
        }else{
            System.out.println("Metoda sum nie działa poprawnie dla liczb "+a+" i "+b);
        }

        Calculator calculator1=new Calculator();
        int subtractResult=calculator1.subtract(5,8);

        boolean right=ResultChecker.assertEquals(-3,subtractResult);
        if(right){
            System.out.println("Metoda subtract działa poprawnie dla liczb "+a+" i "+b);
        }else{
            System.out.println("Metoda subtract nie działa poprawnie dla liczb "+a+" i "+b);
        }

        Calculator calculator2=new Calculator();
        int operationResult=calculator2.operation(5);

        boolean ok=ResultChecker.assertEquals(25,operationResult);
        if(ok){
            System.out.println("Metoda operation działa poprawnie dla liczby "+a);
        }else{
            System.out.println("Metoda operation nie działa poprawnie dla liczby "+a);
        }
    }
}
