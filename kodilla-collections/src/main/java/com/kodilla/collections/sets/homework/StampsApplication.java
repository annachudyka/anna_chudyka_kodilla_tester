package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps=new HashSet<>();
        stamps.add(new Stamp("Castle","47mm x 29mm",true));
        stamps.add(new Stamp("Car","50mm x 35mm",false));
        stamps.add(new Stamp("Mona Lisa","55mm x 40mm",true));
        stamps.add(new Stamp("Castle","47mm x 29mm",true));

        System.out.println("Amount of stamps: "+stamps.size());
        for(Stamp stamp:stamps){
            System.out.println(stamp);
        }
    }
}
