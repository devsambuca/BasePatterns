package net.sambuca.homework.creational.builder;

public class Director {

    ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }
    Computer buildCompter() {
        builder.createComputer();
        builder.buildSystemBox();
        builder.buildHdd();
        builder.buildRam();
        builder.buildProcessor();

        Computer computer = builder.getComputer();
        return computer;
    }

}
