package com.company;

abstract class Animal {
    String name;
    static protected String food;
    static protected String location;
    abstract public void makeNoise();
    abstract public void makeEat();
    abstract public void makeSleep();
    abstract public String getLocation();
    abstract public String getFood();
}
