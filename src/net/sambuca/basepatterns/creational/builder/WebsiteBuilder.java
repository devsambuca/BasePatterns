package net.sambuca.basepatterns.creational.builder;

/**
 * Created by smb on 27.11.2017.
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
