package net.sambuca.homework.creational.factory.factoryEx1;

/**
 * Created by smb on 08.12.2017.
 */
public class ClientLinuxImpl implements Client {
    @Override
    public String getTargetOS() {
        return "Gentoo Linux";
    }
}
