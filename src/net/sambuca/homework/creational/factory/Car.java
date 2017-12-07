package net.sambuca.homework.creational.factory;

/**
 * Created by smb on 07.12.2017.
 */
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
