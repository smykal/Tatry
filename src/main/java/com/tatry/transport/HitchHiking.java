package com.tatry.transport;

import com.tatry.Destination;

public class HitchHiking implements KindOfTransport {
    @Override
    public int move(Destination destination) {
        System.out.println(destination.toString());
        int speed = 30;
        return destination.getHowFar()/speed;
    }
}
