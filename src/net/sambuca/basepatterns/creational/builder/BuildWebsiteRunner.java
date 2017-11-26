package net.sambuca.basepatterns.creational.builder;

/**
 * Created by smb on 27.11.2017.
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
