package net.sambuca.homework.creational.factory.factoryEx1;

/**
 * Created by smb on 08.12.2017.
 */
public class Factory {

    public Client getClient(String currentOS) {
        if (currentOS.equals("win"))
            return new ClientWinImpl();
        else if (currentOS.equals("linux"))
            return new ClientLinuxImpl();
        return null;
    }
}

