package WarGame;

import java.util.Random;

public class Computer implements GamePlayer {


    @Override
    public int putCard() {

        Random random=new Random();

        int result=0;
        result=random.nextInt(11);

        return result;
    }
}
