package net.sambuca.homework.creational.factory;

public class Car implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designed car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufactured car");
    }
}
