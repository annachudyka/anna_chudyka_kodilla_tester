package WarGame;

import java.sql.SQLOutput;

public class Board {
    public static void main(String[] args) {

        Human human=new Human();
        Human human1=new Human();
        Human human2=new Human();
        System.out.println(human.putCard());
        System.out.println(human1.putCard());
        System.out.println(human2.putCard());

        Computer computer=new Computer();
        Computer computer1=new Computer();
        Computer computer2=new Computer();
        System.out.println(computer.putCard());
        System.out.println(computer1.putCard());
        System.out.println(computer2.putCard());




    }
}
