package com.tatry.transport;

import com.tatry.Destination;

public class Bike implements KindOfTransport {
    @Override
    public int move(Destination destination) {
        System.out.println(destination.toString());
        int speed = 15;
        return destination.getHowFar()/speed;
    }
}
