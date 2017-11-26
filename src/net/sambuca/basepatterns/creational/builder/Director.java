package net.sambuca.basepatterns.creational.builder;

/**
 * Created by smb on 27.11.2017.
 */
public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();
        return website;
    }
}
