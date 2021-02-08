package com.tatry.transport;

import com.tatry.Destination;

public class Car implements KindOfTransport {
    @Override
    public int move(Destination destination) {
        System.out.println(destination.toString());
        int speed = 60;
        return destination.getHowFar()/speed;
    }
}
