package com.tatry;

import com.tatry.transport.KindOfTransport;

public class Traveler {

    private String firstName;
    private String lastName;
    private KindOfTransport kindOfTransport;

    public static class Builder {

        private String firstName;
        private String lastName;
        private KindOfTransport kindOfTransport;

        public Builder() {
        }

        Builder(String firstName, String lastName, KindOfTransport kindOfTransport) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.kindOfTransport = kindOfTransport;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return Builder.this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return Builder.this;
        }

        public Builder kindOfTransport(KindOfTransport kindOfTransport){
            this.kindOfTransport = kindOfTransport;
            return Builder.this;
        }

        public Traveler build() {
            if(this.firstName == null){
                throw new NullPointerException("The property \"firstName\" is null. "
                        + "Please set the value by \"firstName()\". "
                        + "The properties \"firstName\", \"lastName\" and \"kindOfTransport\" are required.");
            }
            if(this.lastName == null){
                throw new NullPointerException("The property \"lastName\" is null. "
                        + "Please set the value by \"lastName()\". "
                        + "The properties \"firstName\", \"lastName\" and \"kindOfTransport\" are required.");
            }
            if(this.kindOfTransport == null){
                throw new NullPointerException("The property \"kindOfTransport\" is null. "
                        + "Please set the value by \"kindOfTransport()\". "
                        + "The properties \"firstName\", \"lastName\" and \"kindOfTransport\" are required.");
            }

            return new Traveler(this);
        }
    }

    private Traveler(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.kindOfTransport = builder.kindOfTransport;
    }
    public void zapierdalac(Destination destination) {
        int zapierdalac = this.kindOfTransport.move(destination);
        System.out.println(zapierdalac);
    }
}
