package com.tatry;


import com.tatry.transport.Car;

import static com.tatry.Engine.getInfo;

public class Main {
    public static void main(String[] args) {
        Traveler asia = new Traveler.Builder("Asia", "Makota",new Car())
                .build();
        asia.zapierdalac(getInfo());
    }




}
