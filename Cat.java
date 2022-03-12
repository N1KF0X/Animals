package com.company;

public class Cat extends Animal
{
    static
    {
        food = "вискас";
        location = "квартира";
    }
    Cat(String name)
    {
        this.name = name;
    }
    @Override
    public void makeNoise()
    {
        System.out.println(name + " говорит Мяу");
    }

    @Override
    public void makeEat()
    {
        System.out.println(name + " ест вискас");
    }

    @Override
    public void makeSleep()
    {
        System.out.println("Кот " + name + " спит");
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
