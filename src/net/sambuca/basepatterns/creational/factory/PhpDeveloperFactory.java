package net.sambuca.basepatterns.creational.factory;

/**
 * Created by smb on 26.11.2017.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
