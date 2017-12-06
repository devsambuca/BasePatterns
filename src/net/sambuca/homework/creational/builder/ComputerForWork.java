package net.sambuca.homework.creational.builder;

/**
 * Created by smb on 02.12.2017.
 */
public class ComputerForWork extends ComputerBuilder {
    @Override
    void buildSystemBox() {
        computer.setSystemBox("Black TechLine");
    }

    @Override
    void buildHdd() {
        computer.setHdd(new Sata2());
    }

    @Override
    void buildRam() {
        computer.setRam(4);
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i3 2.3");
    }
}
