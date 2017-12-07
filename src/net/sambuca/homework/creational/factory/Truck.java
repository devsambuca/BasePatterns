package net.sambuca.homework.creational.factory;

/**
 * Created by smb on 07.12.2017.
 */
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
