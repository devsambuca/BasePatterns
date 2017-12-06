package net.sambuca.homework.creational.builder;

/**
 * Created by smb on 02.12.2017.
 */
public class ComputerForGame extends ComputerBuilder {

    @Override
    void buildSystemBox() {
        computer.setSystemBox("White");
    }

    @Override
    void buildHdd() {
        computer.setHdd(new Sata3());
    }

    @Override
    void buildRam() {
        computer.setRam(16);
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i7 3.1");
    }
}

