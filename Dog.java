package com.company;

public class Dog extends Animal
{
    static
    {
        food = "кость";
        location = "будка";
    }
    Dog(String name)
    {
        this.name = name;
    }
    @Override
    public void makeNoise()
    {
        System.out.println(name+ " говорит гав-гав");
    }

    @Override
    public void makeEat()
    {
        System.out.println(name+" грызёт кость");
    }

    @Override
    public void makeSleep()
    {
        System.out.println("Собакен " + name + "  спит");
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
