package net.sambuca.homework.creational.factory;

import java.util.Scanner;

public class FactoryMethodClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        /* Create a factory instance */
        VehicleFactory factory = new VehicleFactory();

        try {
            /* Create an appropriate Vehicle based on the input */
           Vehicle vehicle = factory.getVehicle(vehicleType);

           /* Design and manufacture the vehicle */
           vehicle.design();
           vehicle.manufacture();
        } catch (VehicleTypeNotFoundException e) {
            System.out.println("Invalid vehicle type entered!");
        }
        in.close();
    }
}
