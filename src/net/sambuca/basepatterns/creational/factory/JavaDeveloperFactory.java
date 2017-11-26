package net.sambuca.basepatterns.creational.factory;

/**
 * Created by smb on 26.11.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
