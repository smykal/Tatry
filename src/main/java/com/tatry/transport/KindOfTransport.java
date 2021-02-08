package com.tatry.transport;

import com.tatry.Destination;

public interface KindOfTransport {
    default int move(Destination destination) {
        return 0;
    }
}
