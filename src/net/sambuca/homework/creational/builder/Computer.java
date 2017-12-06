package net.sambuca.homework.creational.builder;

/**
 * Created by smb on 02.12.2017.
 */
public class Computer {

    private String systemBox;
    private HDD hdd;
    private String processor;
    private int ram;

    public void setSystemBox(String systemBox) {
        this.systemBox = systemBox;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "systemBox='" + systemBox + '\'' +
                ", hdd=" + hdd +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                '}';
    }
}
