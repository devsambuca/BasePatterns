package net.sambuca.homework.creational.factory;

public class Truck implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designed truck");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufactured truck");
    }
}
