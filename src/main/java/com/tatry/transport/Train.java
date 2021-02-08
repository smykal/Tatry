package com.tatry.transport;

import com.tatry.Destination;

public class Train implements KindOfTransport {
    @Override
    public int move(Destination destination) {
        System.out.println(destination.toString());
        int speed = 100;
        return destination.getHowFar()/speed;
    }
}
