package com.company;

import java.util.Scanner;

public class Main
{
    public static class Vet
    {
        static void treatAnimal(Animal animal)
        {
            System.out.println("Для животного ("+animal.name+") подготовили место (" + animal.getLocation() + ") и дали " + animal.getFood());
        }
    }
    public static void main(String[] args)
    {
    Dog rex = new Dog("Рекс");
    Vet.treatAnimal(rex);
    }
}


