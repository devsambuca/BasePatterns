package net.sambuca.homework.creational.factory;

public class Motorcycle implements Vehicle {

    @Override
    public void design() {
    System.out.println("Designed motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufactured motocycle");
    }
}
