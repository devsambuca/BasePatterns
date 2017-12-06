package net.sambuca.homework.creational.builder;

/**
 * Created by smb on 02.12.2017.
 */
public class ComputerBuildRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ComputerForGame());
        Computer computer = director.buildCompter();

        System.out.println(computer.toString());
    }
}
