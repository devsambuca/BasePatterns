package net.sambuca.basepatterns.creational.factory;

/**
 * Created by smb on 26.11.2017.
 */
public class Program {
    public static void main(String[] args) {
        Developer developer = new CppDeveloper();
        developer.writeCode();
    }
}
