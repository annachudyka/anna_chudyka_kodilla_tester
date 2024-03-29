package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Suzuki;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random=new Random();
        Car[] cars=new Car[random.nextInt(15)+1];
        for(int n=0; n<cars.length; n++)
            cars[n]=drawCar();
        for(Car car:cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random=new Random();
        int drawnCarKind=random.nextInt(3);
        int a=random.nextInt()*100+1;
        if(drawnCarKind==0)
            return new Ford(a);
        else if(drawnCarKind==1)
            return new Opel(a);
        else
            return new Suzuki(a);
    }
}
