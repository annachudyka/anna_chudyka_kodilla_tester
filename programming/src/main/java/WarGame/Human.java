package WarGame;

import java.util.Random;

public class Human implements GamePlayer{

    @Override
    public int putCard() {

        /*
        losowanie  w obrębie tablicy, może z wykorzystaniem pętli. wylosowana karta powinna być
        zawsze większa od karty wylosowanej przez przeciwnika -> while
         */

        Random random=new Random();

        int result=0;
        result=random.nextInt(11);

        return result;

    }
}
