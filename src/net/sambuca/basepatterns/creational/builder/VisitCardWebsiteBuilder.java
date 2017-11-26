package net.sambuca.basepatterns.creational.builder;

/**
 * Created by smb on 27.11.2017.
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit card");

    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrice() {
        website.setPrice(500);

    }
}
