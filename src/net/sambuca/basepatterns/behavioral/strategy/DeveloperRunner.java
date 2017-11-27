package net.sambuca.basepatterns.behavioral.strategy;

/**
 * Created by smb on 27.11.2017.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
