package net.sambuca.basepatterns.creational.factory;

/**
 * Created by smb on 26.11.2017.
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}
