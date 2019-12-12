package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Ford;

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

        cars.remove(0);
        cars.remove(frd);

        System.out.println(cars.size());
        for(Ford ford:cars){
            System.out.println(ford);
            CarUtils.describeCar(ford);

        }

    }

}
