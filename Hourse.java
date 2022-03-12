package com.company;

public class Hourse extends Animal
{
    static
    {
        food = "сахар";
        location = "конюшня";
    }
    Hourse(String name)
    {
        this.name = name;
    }
    @Override
    public void makeNoise()
    {
        System.out.println(name + " говорит И-го-го");
    }

    @Override
    public void makeEat()
    {
        System.out.println(name + " Ест сахар");
    }

    @Override
    public void makeSleep()
    {
        System.out.println("Конь " + name + " спит");
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
