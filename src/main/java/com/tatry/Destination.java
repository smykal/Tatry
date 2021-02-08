package com.tatry;

public class Destination {

    private String name;
    private Integer howFar;
    private Level level;

    public static class Builder {

        private String name;
        private Integer howFar;
        private Level level;

        public Builder() {
        }

        Builder(String name, Integer howFar, Level level) {
            this.name = name;
            this.howFar = howFar;
            this.level = level;
        }

        public Builder name(String name){
            this.name = name;
            return Builder.this;
        }

        public Builder howFar(Integer howFar){
            this.howFar = howFar;
            return Builder.this;
        }

        public Builder level(Level level){
            this.level = level;
            return Builder.this;
        }



        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", howFar=" + howFar +
                    ", level=" + level +
                    '}';
        }

        public Destination build() {
            if(this.name == null){
                throw new NullPointerException("The property \"name\" is null. "
                        + "Please set the value by \"name()\". "
                        + "The properties \"name\", \"howFar\" are required.");
            }
            if(this.howFar == null){
                throw new NullPointerException("The property \"howFar\" is null. "
                        + "Please set the value by \"howFar()\". "
                        + "The properties \"name\", \"howFar\" are required.");
            }

            return new Destination(this);
        }

    }

    private Destination(Builder builder) {
        this.name = builder.name;
        this.howFar = builder.howFar;
        this.level = builder.level;
    }
    public Integer getHowFar() {
        return howFar;
    }
}
