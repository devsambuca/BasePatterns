package net.sambuca.basepatterns.creational.factory;

/**
 * Created by smb on 26.11.2017.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
