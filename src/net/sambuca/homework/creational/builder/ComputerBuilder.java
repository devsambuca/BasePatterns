package net.sambuca.homework.creational.builder;

public abstract class ComputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }

    abstract void buildSystemBox();
    abstract void buildHdd();
    abstract void buildRam();
    abstract void buildProcessor();

    Computer getComputer() {
        return computer;
    }

}
