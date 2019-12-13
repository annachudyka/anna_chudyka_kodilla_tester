package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Ford;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Ford>cars=new ArrayList<>();
        cars.add(new Ford(80));
        Ford frd=new Ford(50);
        cars.add(frd);
        //cars.add(new Ford(50));
        cars.add(new Ford(65));

        System.out.println("Amount of cars: "+cars.size());
        for(Ford ford:cars){
            CarUtils.describeCar(ford);
        }
        cars.remove(0);
        cars.remove(frd);

        System.out.println("Amount of cars: "+cars.size());
    }

}
